package com.example.bookmarkerapi.service;


import com.example.bookmarkerapi.domain.Bookmark;
import com.example.bookmarkerapi.dto.BookmarkDTO;

import java.util.List;

public interface BookmarkService {


    public BookmarkDTO getBookmark(Integer page);
}
