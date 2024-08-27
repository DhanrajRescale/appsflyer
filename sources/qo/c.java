package qo;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import bl.j;

/* loaded from: classes2.dex */
public final class c extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f32098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextPaint f32099c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f32100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f32101e;

    public c(d dVar, Context context, TextPaint textPaint, j jVar) {
        this.f32101e = dVar;
        this.f32098b = context;
        this.f32099c = textPaint;
        this.f32100d = jVar;
    }

    @Override // bl.j
    public final void N(int i10) {
        this.f32100d.N(i10);
    }

    @Override // bl.j
    public final void O(Typeface typeface, boolean z10) {
        this.f32101e.g(this.f32098b, this.f32099c, typeface);
        this.f32100d.O(typeface, z10);
    }
}
