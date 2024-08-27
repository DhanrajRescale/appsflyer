package bn;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import b4.l;

/* loaded from: classes2.dex */
public abstract class d extends l {

    /* renamed from: c, reason: collision with root package name */
    public final qm.a f7148c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f7149d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f7150e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f7151f;

    public d(qm.a aVar, cn.i iVar) {
        super(iVar, 8);
        this.f7148c = aVar;
        Paint paint = new Paint(1);
        this.f7149d = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f7151f = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(cn.h.c(9.0f));
        Paint paint3 = new Paint(1);
        this.f7150e = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f7150e.setStrokeWidth(2.0f);
        this.f7150e.setColor(Color.rgb(255, 187, 115));
    }

    public final void h(um.h hVar) {
        Paint paint = this.f7151f;
        paint.setTypeface(null);
        paint.setTextSize(hVar.f37270n);
    }

    public abstract void i(Canvas canvas);

    public abstract void j(Canvas canvas);

    public abstract void k(Canvas canvas, wm.c[] cVarArr);

    public abstract void l(Canvas canvas);

    public abstract void m();
}
