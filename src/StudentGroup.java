import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		int array[n]=n;
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students=array[n] ;
		
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		this.index=index;
		return index;
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		this.students=student[] student;
		this.index=index;
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		this.firstDate=student[] student;
		array[n]=student[] student;
		return addFirst;
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		this.students=student[] students;
		array[n]=student[] student;
		return addLast;
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		this.students[]=student[] student;
		array[n]=student[] student;
		return add;
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		this.index[]=index;
		return index;
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		this.students[]=student[] student;
		return students;
		
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		this.index[]=students[] student;
		return index;
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		this.students=student[] student;
		return students;
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		this.students[]=stu
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		this.firstDate=date;
		this.lastdate=date;
		return null;
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		this.BirthDate[]=BirthDate;
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		this
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
