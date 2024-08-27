package e4;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f14968a;

    /* renamed from: b, reason: collision with root package name */
    public final m f14969b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14970c;

    public a(int i10, m mVar, int i11) {
        this.f14968a = i10;
        this.f14969b = mVar;
        this.f14970c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f14968a);
        this.f14969b.f14996a.performAction(this.f14970c, bundle);
    }
}
