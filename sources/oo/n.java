package oo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final e f30215a;

    /* renamed from: b, reason: collision with root package name */
    public m f30216b;

    public n(e eVar) {
        this.f30215a = eVar;
    }

    public abstract void a(Canvas canvas, Rect rect, float f10);

    public abstract void b(Canvas canvas, Paint paint, float f10, float f11, int i10);

    public abstract void c(Canvas canvas, Paint paint);

    public abstract int d();

    public abstract int e();
}
