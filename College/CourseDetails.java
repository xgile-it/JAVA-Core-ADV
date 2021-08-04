package College;

import java.io.Serializable;
import java.util.List;

public class CourseDetails implements Serializable {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		int courseId;  // this should be unique
		String courseName; 
		int courseDuration;
		List<String> subjectsName;
		
		public CourseDetails(int courseId, String courseName, int courseDuration, List<String> subjectsName) 
			{
				this.courseId = courseId;
				this.courseName = courseName;
				this.courseDuration = courseDuration;
				this.subjectsName = subjectsName;
			}

		public int getCourseId() {
			return courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}


		public int getCourseDuration() {
			return courseDuration;
		}

		public void setCourseDuration(int courseDuration) {
			this.courseDuration = courseDuration;
		}

		public List<String> getSubjectsName() {
			return subjectsName;
		}

		public void setSubjectsName(List<String> subjectsName) {
			this.subjectsName = subjectsName;
		}

		@Override
		public int hashCode() {
			
			return courseId;
		}

		@Override
		public boolean equals(Object obj) {
			CourseDetails courseDetails = (CourseDetails) obj;
			return (courseId == courseDetails.courseId);
		}

		@Override
		public String toString() {
			return "CourseDetails [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration="
					+ courseDuration + ", subjectsName=" + subjectsName + "]";
		}
		
		}
		
