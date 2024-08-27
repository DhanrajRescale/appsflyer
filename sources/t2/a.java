package t2;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;
import n1.q0;
import n1.s0;
import p1.i;
import p1.k;
import p1.m;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final i f35286a;

    public a(i iVar) {
        this.f35286a = iVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        PathEffect pathEffect;
        if (textPaint != null) {
            k kVar = k.f30509a;
            i iVar = this.f35286a;
            if (Intrinsics.a(iVar, kVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (iVar instanceof m) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((m) iVar).f30511a);
                textPaint.setStrokeMiter(((m) iVar).f30512b);
                int i10 = ((m) iVar).f30514d;
                if (s0.f(i10, 0)) {
                    join = Paint.Join.MITER;
                } else if (s0.f(i10, 1)) {
                    join = Paint.Join.ROUND;
                } else if (s0.f(i10, 2)) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i11 = ((m) iVar).f30513c;
                if (s0.e(i11, 0)) {
                    cap = Paint.Cap.BUTT;
                } else if (s0.e(i11, 1)) {
                    cap = Paint.Cap.ROUND;
                } else if (s0.e(i11, 2)) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                q0 q0Var = ((m) iVar).f30515e;
                if (q0Var != null) {
                    pathEffect = ((n1.i) q0Var).f28142a;
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            }
        }
    }
}
