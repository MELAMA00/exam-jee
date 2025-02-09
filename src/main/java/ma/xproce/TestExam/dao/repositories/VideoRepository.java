package ma.xproce.TestExam.dao.repositories;

import ma.xproce.TestExam.dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
