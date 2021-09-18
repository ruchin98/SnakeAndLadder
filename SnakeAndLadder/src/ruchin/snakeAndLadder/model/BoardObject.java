package ruchin.snakeAndLadder.model;

public class BoardObject {
    private Integer tailPosition;
    private Integer headPosition;

    public Integer getTailPosition() {
        return tailPosition;
    }

    public void setTailPosition(Integer tailPosition) {
        this.tailPosition = tailPosition;
    }

    public Integer getHeadPosition() {
        return headPosition;
    }

    public void setHeadPosition(Integer headPosition) {
        this.headPosition = headPosition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
}
