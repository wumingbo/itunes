package itunes;

import java.util.HashMap;

public class Song {
	
	private String trackId;
	private String name;
	private String artist;
	private String albumArtist;
	private String album;
	private String genre;
	private String kind;
	private String size;
	private String totalTime;
	private String trackNumber;
	private String year;
	private String dateModified;
	private String dateAdded;
	private String bitRate;
	private String sampleRate;
	private String partOfGaplessAlbum;
	private String playCount;
	private String playDate;
	private String playDateUtc;
	private String skipCount;
	private String skipDate;
	private String sortArtist;
	private String persistentId;
	private String trackType;
	private String fileType;
	private String location;
	private String fileFolderCount;
	private String libraryFolderCount;
	
	public Song(HashMap<String,String> attr) {
		trackId = attr.get("Track ID");
		name =  attr.get("Name");
		artist = attr.get("Artist");
		albumArtist = attr.get("Album Artist");
		album = attr.get("Album");
		genre = attr.get("Genre"); 
		kind = attr.get("Kind");
		size = attr.get("Size");
		totalTime = attr.get("Total Time");
		trackNumber = attr.get("Track Number");
		year = attr.get("Year");
		dateModified = attr.get("Date Modified");
		dateAdded = attr.get("Date Added");
		bitRate = attr.get("Bit Rate");
		sampleRate = attr.get("Sample Rate");
		partOfGaplessAlbum = attr.get("Part of Gapless Album");
		playCount = attr.get("Play Count");
		playDate = attr.get("Play Date");
		playDateUtc = attr.get("Play Date UTC");
		skipCount = attr.get("Skip Count");
		sortArtist = attr.get("Sort Artist");
		persistentId = attr.get("Persistent ID");
		trackType = attr.get("Track Type");
		fileType = attr.get("File Type");
		location = attr.get("Location");
		fileFolderCount = attr.get("File Folder Count");
		libraryFolderCount = attr.get("Library Folder Count");
	}
	
	public void printSong() {
		System.out.println("Track ID: " + trackId);
		System.out.println("Name: " + name);
		System.out.println("Artist: " + artist);
		System.out.println("Album Artist: " + albumArtist);
		System.out.println("Album: " + album);
		System.out.println("Genre: " + genre);
		System.out.println("Kind: " + kind);
		System.out.println("Size: " + size);
		System.out.println("Total Time: " + totalTime);
		System.out.println("Track Number: " + trackNumber);
		System.out.println("Year: " + year);
		System.out.println("Date Modified: " + dateModified);
		System.out.println("Date Added: " + dateAdded);
		System.out.println("Bit Rate: " + bitRate);
		System.out.println("Sample Rate: " + sampleRate);
		System.out.println("Part of Gapless Album: " + partOfGaplessAlbum);
		System.out.println("Play Count: " + playCount);
		System.out.println("Play Date: " + playDate);
		System.out.println("Play Date UTC: " + playDateUtc);
		System.out.println("Skip Count: " + skipCount);
		System.out.println("Sort Artist: " + sortArtist);
		System.out.println("Persistent ID: " + persistentId);
		System.out.println("Track Type: " + trackType);
		System.out.println("File Type: " + fileType);
		System.out.println("Location: " + location);
		System.out.println("File Folder Count: " + fileFolderCount);
		System.out.println("Library Folder Count: " + libraryFolderCount);
	}
	
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbumArtist() {
		return albumArtist;
	}
	public void setAlbumArtist(String albumArtist) {
		this.albumArtist = albumArtist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
	public String getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(String trackNumber) {
		this.trackNumber = trackNumber;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDateModified() {
		return dateModified;
	}
	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}
	public String getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	public String getBitRate() {
		return bitRate;
	}
	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
	}
	public String getSampleRate() {
		return sampleRate;
	}
	public void setSampleRate(String sampleRate) {
		this.sampleRate = sampleRate;
	}
	public String getPartOfGaplessAlbum() {
		return partOfGaplessAlbum;
	}
	public void setPartOfGaplessAlbum(String partOfGaplessAlbum) {
		this.partOfGaplessAlbum = partOfGaplessAlbum;
	}
	public String getPlayCount() {
		return playCount;
	}
	public void setPlayCount(String playCount) {
		this.playCount = playCount;
	}
	public String getPlayDate() {
		return playDate;
	}
	public void setPlayDate(String playDate) {
		this.playDate = playDate;
	}
	public String getPlayDateUtc() {
		return playDateUtc;
	}
	public void setPlayDateUtc(String playDateUtc) {
		this.playDateUtc = playDateUtc;
	}
	public String getSkipCount() {
		return skipCount;
	}
	public void setSkipCount(String skipCount) {
		this.skipCount = skipCount;
	}
	public String getSkipDate() {
		return skipDate;
	}
	public void setSkipDate(String skipDate) {
		this.skipDate = skipDate;
	}
	public String getSortArtist() {
		return sortArtist;
	}
	public void setSortArtist(String sortArtist) {
		this.sortArtist = sortArtist;
	}
	public String getPersistentId() {
		return persistentId;
	}
	public void setPersistentId(String persistentId) {
		this.persistentId = persistentId;
	}
	public String getTrackType() {
		return trackType;
	}
	public void setTrackType(String trackType) {
		this.trackType = trackType;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFileFolderCount() {
		return fileFolderCount;
	}
	public void setFileFolderCount(String fileFolderCount) {
		this.fileFolderCount = fileFolderCount;
	}
	public String getLibraryFolderCount() {
		return libraryFolderCount;
	}
	public void setLibraryFolderCount(String libraryFolderCount) {
		this.libraryFolderCount = libraryFolderCount;
	}
}
