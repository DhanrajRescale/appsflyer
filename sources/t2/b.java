package t2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import c2.p0;
import m1.f;
import n1.v0;
import t0.j0;
import t0.n1;
import t0.o3;
import t0.t;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f35287a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35288b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f35289c = t.n0(new f(f.f27252c), o3.f35116a);

    /* renamed from: d, reason: collision with root package name */
    public final j0 f35290d = t.N(new p0(this, 7));

    public b(v0 v0Var, float f10) {
        this.f35287a = v0Var;
        this.f35288b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        hl.f.O0(textPaint, this.f35288b);
        textPaint.setShader((Shader) this.f35290d.getValue());
    }
}
