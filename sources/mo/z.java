package mo;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public float f27976c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f27978e;

    /* renamed from: f, reason: collision with root package name */
    public qo.d f27979f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f27974a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final fo.a f27975b = new fo.a(this, 1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f27977d = true;

    public z(y yVar) {
        this.f27978e = new WeakReference(null);
        this.f27978e = new WeakReference(yVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f27977d) {
            return this.f27976c;
        }
        if (str == null) {
            measureText = s0.g.f34069a;
        } else {
            measureText = this.f27974a.measureText((CharSequence) str, 0, str.length());
        }
        this.f27976c = measureText;
        this.f27977d = false;
        return measureText;
    }

    public final void b(qo.d dVar, Context context) {
        if (this.f27979f != dVar) {
            this.f27979f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f27974a;
                fo.a aVar = this.f27975b;
                dVar.f(context, textPaint, aVar);
                y yVar = (y) this.f27978e.get();
                if (yVar != null) {
                    textPaint.drawableState = yVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.f27977d = true;
            }
            y yVar2 = (y) this.f27978e.get();
            if (yVar2 != null) {
                yVar2.a();
                yVar2.onStateChange(yVar2.getState());
            }
        }
    }
}
