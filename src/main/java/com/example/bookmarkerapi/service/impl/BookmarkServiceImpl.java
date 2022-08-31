package com.example.bookmarkerapi.service.impl;

import com.example.bookmarkerapi.domain.Bookmark;
import com.example.bookmarkerapi.dto.BookmarkDTO;
import com.example.bookmarkerapi.repository.BookmarkRepository;
import com.example.bookmarkerapi.service.BookmarkService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookmarkServiceImpl implements BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    public BookmarkServiceImpl(BookmarkRepository bookmarkRepository) {
        this.bookmarkRepository = bookmarkRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public BookmarkDTO getBookmark(Integer page) {
        int pageNo = page < 1 ? 0 : page - 1;
        Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC, "createdAt");

        return new BookmarkDTO(bookmarkRepository.findAll(pageable));
    }
}
