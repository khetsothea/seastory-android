﻿// 도박중독 예방 캠페인
// 당신 곁에 우리가 있어요!
// 감당하기 힘든 어려움을 혼자 견디고 계신가요?
// 무엇을 어떻게 해야 할지 막막한가요?
// 당신의 이야기를 듣고 도움을 줄 수 있는 정보를 찾아 드립니다.
// - 한국도박문제관리센터 (국번없이 1336, 24시간)
// - KL중독관리센터 (전화상담  080-7575-535/545)
// - 사행산업통합감독위원회 불법사행산업감시신고센터 (전화상담 1588-0112)
// - 불법도박 등 범죄수익 신고 (지역번호 + 1301)

package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;

public final class LineSpawnShapeValue extends PrimitiveSpawnShapeValue {
    public LineSpawnShapeValue() {
        super();
    }

    public LineSpawnShapeValue(LineSpawnShapeValue value) {
        super(((PrimitiveSpawnShapeValue)value));
        this.load(((ParticleValue)value));
    }

    public SpawnShapeValue copy() {
        return new LineSpawnShapeValue(this);
    }

    public void spawnAux(Vector3 vector, float percent) {
        float v3 = this.spawnWidth + this.spawnWidthDiff * this.spawnWidthValue.getScale(percent);
        float v2 = this.spawnHeight + this.spawnHeightDiff * this.spawnHeightValue.getScale(percent);
        float v1 = this.spawnDepth + this.spawnDepthDiff * this.spawnDepthValue.getScale(percent);
        float v0 = MathUtils.random();
        vector.x = v0 * v3;
        vector.y = v0 * v2;
        vector.z = v0 * v1;
    }
}
