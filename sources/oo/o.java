package oo;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class o extends m {

    /* renamed from: l, reason: collision with root package name */
    public final n f30217l;

    /* renamed from: m, reason: collision with root package name */
    public l.d f30218m;

    public o(Context context, e eVar, n nVar, l.d dVar) {
        super(context, eVar);
        this.f30217l = nVar;
        nVar.f30216b = this;
        this.f30218m = dVar;
        dVar.f23559a = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            n nVar = this.f30217l;
            Rect bounds = getBounds();
            float b10 = b();
            nVar.f30215a.a();
            nVar.a(canvas, bounds, b10);
            n nVar2 = this.f30217l;
            Paint paint = this.f30213i;
            nVar2.c(canvas, paint);
            int i10 = 0;
            while (true) {
                l.d dVar = this.f30218m;
                int[] iArr = (int[]) dVar.f23561c;
                if (i10 < iArr.length) {
                    n nVar3 = this.f30217l;
                    float[] fArr = (float[]) dVar.f23560b;
                    int i11 = i10 * 2;
                    nVar3.b(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
                    i10++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // oo.m
    public final boolean f(boolean z10, boolean z11, boolean z12) {
        boolean f10 = super.f(z10, z11, z12);
        if (!isRunning()) {
            this.f30218m.c();
        }
        a aVar = this.f30207c;
        ContentResolver contentResolver = this.f30205a.getContentResolver();
        aVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z10 && z12) {
            this.f30218m.n();
        }
        return f10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f30217l.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f30217l.e();
    }
}
