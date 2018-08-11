package com.my.openfeign.model;

import java.util.Date;

public class Attachment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attachment.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attachment.objType
     *
     * @mbggenerated
     */
    private String objType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attachment.fileName
     *
     * @mbggenerated
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attachment.size
     *
     * @mbggenerated
     */
    private Long size;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attachment.filePath
     *
     * @mbggenerated
     */
    private String filePath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attachment.fileId
     *
     * @mbggenerated
     */
    private Integer fileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attachment.cloudFlag
     *
     * @mbggenerated
     */
    private Integer cloudFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attachment.createDate
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_attachment.md5
     *
     * @mbggenerated
     */
    private String md5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attachment.id
     *
     * @return the value of t_attachment.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attachment.id
     *
     * @param id the value for t_attachment.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attachment.objType
     *
     * @return the value of t_attachment.objType
     *
     * @mbggenerated
     */
    public String getObjType() {
        return objType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attachment.objType
     *
     * @param objType the value for t_attachment.objType
     *
     * @mbggenerated
     */
    public void setObjType(String objType) {
        this.objType = objType == null ? null : objType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attachment.fileName
     *
     * @return the value of t_attachment.fileName
     *
     * @mbggenerated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attachment.fileName
     *
     * @param fileName the value for t_attachment.fileName
     *
     * @mbggenerated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attachment.size
     *
     * @return the value of t_attachment.size
     *
     * @mbggenerated
     */
    public Long getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attachment.size
     *
     * @param size the value for t_attachment.size
     *
     * @mbggenerated
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attachment.filePath
     *
     * @return the value of t_attachment.filePath
     *
     * @mbggenerated
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attachment.filePath
     *
     * @param filePath the value for t_attachment.filePath
     *
     * @mbggenerated
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attachment.fileId
     *
     * @return the value of t_attachment.fileId
     *
     * @mbggenerated
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attachment.fileId
     *
     * @param fileId the value for t_attachment.fileId
     *
     * @mbggenerated
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attachment.cloudFlag
     *
     * @return the value of t_attachment.cloudFlag
     *
     * @mbggenerated
     */
    public Integer getCloudFlag() {
        return cloudFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attachment.cloudFlag
     *
     * @param cloudFlag the value for t_attachment.cloudFlag
     *
     * @mbggenerated
     */
    public void setCloudFlag(Integer cloudFlag) {
        this.cloudFlag = cloudFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attachment.createDate
     *
     * @return the value of t_attachment.createDate
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attachment.createDate
     *
     * @param createDate the value for t_attachment.createDate
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_attachment.md5
     *
     * @return the value of t_attachment.md5
     *
     * @mbggenerated
     */
    public String getMd5() {
        return md5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_attachment.md5
     *
     * @param md5 the value for t_attachment.md5
     *
     * @mbggenerated
     */
    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "id='" + id + '\'' +
                ", objType='" + objType + '\'' +
                ", fileName='" + fileName + '\'' +
                ", size=" + size +
                ", filePath='" + filePath + '\'' +
                ", fileId=" + fileId +
                ", cloudFlag=" + cloudFlag +
                ", createDate=" + createDate +
                ", md5='" + md5 + '\'' +
                '}';
    }
}