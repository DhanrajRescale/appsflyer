package n1;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class v0 extends p {

    /* renamed from: a, reason: collision with root package name */
    public Shader f28201a;

    /* renamed from: b, reason: collision with root package name */
    public long f28202b = m1.f.f27252c;

    @Override // n1.p
    public final void a(float f10, long j10, f fVar) {
        Shader shader = this.f28201a;
        if (shader == null || !m1.f.b(this.f28202b, j10)) {
            if (m1.f.f(j10)) {
                shader = null;
                this.f28201a = null;
                this.f28202b = m1.f.f27252c;
            } else {
                shader = b(j10);
                this.f28201a = shader;
                this.f28202b = j10;
            }
        }
        long c10 = androidx.compose.ui.graphics.a.c(fVar.f28130a.getColor());
        long j11 = t.f28170b;
        if (!t.d(c10, j11)) {
            fVar.f(j11);
        }
        if (!Intrinsics.a(fVar.f28132c, shader)) {
            fVar.j(shader);
        }
        if (fVar.f28130a.getAlpha() / 255.0f != f10) {
            fVar.d(f10);
        }
    }

    public abstract Shader b(long j10);
}
