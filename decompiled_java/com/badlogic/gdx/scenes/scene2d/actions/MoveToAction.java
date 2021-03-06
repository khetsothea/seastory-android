﻿// 도박중독 예방 캠페인
// 당신 곁에 우리가 있어요!
// 감당하기 힘든 어려움을 혼자 견디고 계신가요?
// 무엇을 어떻게 해야 할지 막막한가요?
// 당신의 이야기를 듣고 도움을 줄 수 있는 정보를 찾아 드립니다.
// - 한국도박문제관리센터 (국번없이 1336, 24시간)
// - KL중독관리센터 (전화상담  080-7575-535/545)
// - 사행산업통합감독위원회 불법사행산업감시신고센터 (전화상담 1588-0112)
// - 불법도박 등 범죄수익 신고 (지역번호 + 1301)

package com.badlogic.gdx.scenes.scene2d.actions;

public class MoveToAction extends TemporalAction {
    private int alignment;
    private float endX;
    private float endY;
    private float startX;
    private float startY;

    public MoveToAction() {
        super();
        this.alignment = 12;
    }

    protected void begin() {
        this.startX = this.target.getX(this.alignment);
        this.startY = this.target.getY(this.alignment);
    }

    public int getAlignment() {
        return this.alignment;
    }

    public float getX() {
        return this.endX;
    }

    public float getY() {
        return this.endY;
    }

    public void reset() {
        super.reset();
        this.alignment = 12;
    }

    public void setAlignment(int alignment) {
        this.alignment = alignment;
    }

    public void setPosition(float x, float y) {
        this.endX = x;
        this.endY = y;
    }

    public void setPosition(float x, float y, int alignment) {
        this.endX = x;
        this.endY = y;
        this.alignment = alignment;
    }

    public void setX(float x) {
        this.endX = x;
    }

    public void setY(float y) {
        this.endY = y;
    }

    protected void update(float percent) {
        this.target.setPosition(this.startX + (this.endX - this.startX) * percent, this.startY + (this.endY - this.startY) * percent, this.alignment);
    }
}

