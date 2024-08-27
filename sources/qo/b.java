package qo;

import android.graphics.Typeface;
import bl.j;

/* loaded from: classes2.dex */
public final class b extends j {

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f32095b;

    /* renamed from: c, reason: collision with root package name */
    public final a f32096c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32097d;

    public b(a aVar, Typeface typeface) {
        this.f32095b = typeface;
        this.f32096c = aVar;
    }

    @Override // bl.j
    public final void N(int i10) {
        if (!this.f32097d) {
            this.f32096c.b(this.f32095b);
        }
    }

    @Override // bl.j
    public final void O(Typeface typeface, boolean z10) {
        if (!this.f32097d) {
            this.f32096c.b(typeface);
        }
    }
}
