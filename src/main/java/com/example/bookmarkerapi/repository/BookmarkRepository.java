package com.example.bookmarkerapi.repository;

import com.example.bookmarkerapi.domain.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}
