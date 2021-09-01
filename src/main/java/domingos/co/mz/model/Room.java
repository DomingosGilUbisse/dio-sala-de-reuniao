package domingos.co.mz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Room {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	@Column
	private String name;
	@Column(nullable = false)
	private String date;
	@Column(nullable = false)
	private String startHour;
	@Column(nullable = false)
	private String endHour;
;

}
