package org.example.demo2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDAO {
  private Long id;
  private Long author_id;
  private String authorName;
  private Long postId;
  private String postTitle;
  private Date postCreatedAt;
  private String content;
  private Date createdAt;
}
