package edu.mum.roomsys.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book_item")
public class BookItem {

	@Id
	@GeneratedValue
	private int id;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 50, nullable = false)	
	private BookingItemType itemType;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus walls;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus windows;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus screens;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus blinds;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus sink;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus counter;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus mirror;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus floor;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus closet;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus towel;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus shower;

	@Column(length = 50, nullable = false)
	@Enumerated(EnumType.STRING)
	private ItemStatus thermostat;
	
	
	@JoinColumn(name = "booking_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Booking booking;

	public BookItem() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ItemStatus getWalls() {
		return walls;
	}

	public void setWalls(ItemStatus walls) {
		this.walls = walls;
	}

	public ItemStatus getWindows() {
		return windows;
	}

	public void setWindows(ItemStatus windows) {
		this.windows = windows;
	}

	public ItemStatus getScreens() {
		return screens;
	}

	public void setScreens(ItemStatus screens) {
		this.screens = screens;
	}

	public ItemStatus getBlinds() {
		return blinds;
	}

	public void setBlinds(ItemStatus blinds) {
		this.blinds = blinds;
	}

	public ItemStatus getSink() {
		return sink;
	}

	public void setSink(ItemStatus sink) {
		this.sink = sink;
	}

	public ItemStatus getCounter() {
		return counter;
	}

	public void setCounter(ItemStatus counter) {
		this.counter = counter;
	}

	public ItemStatus getMirror() {
		return mirror;
	}

	public void setMirror(ItemStatus mirror) {
		this.mirror = mirror;
	}

	public ItemStatus getFloor() {
		return floor;
	}

	public void setFloor(ItemStatus floor) {
		this.floor = floor;
	}

	public ItemStatus getCloset() {
		return closet;
	}

	public void setCloset(ItemStatus closet) {
		this.closet = closet;
	}

	public ItemStatus getTowel() {
		return towel;
	}

	public void setTowel(ItemStatus towel) {
		this.towel = towel;
	}

	public ItemStatus getThermostat() {
		return thermostat;
	}

	public void setThermostat(ItemStatus thermostat) {
		this.thermostat = thermostat;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public BookingItemType getItemType() {
		return itemType;
	}

	public void setItemType(BookingItemType itemType) {
		this.itemType = itemType;
	}

	public ItemStatus getShower() {
		return shower;
	}

	public void setShower(ItemStatus shower) {
		this.shower = shower;
	}
	
	
}
