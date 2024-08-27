package d7;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class t0 extends FrameLayout implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f14116a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f14117b;

    /* renamed from: c, reason: collision with root package name */
    public List f14118c;

    /* renamed from: d, reason: collision with root package name */
    public d f14119d;

    /* renamed from: e, reason: collision with root package name */
    public float f14120e;

    /* renamed from: f, reason: collision with root package name */
    public int f14121f;

    /* renamed from: g, reason: collision with root package name */
    public float f14122g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [d7.r0, android.view.View, android.webkit.WebView] */
    public t0(Context context) {
        super(context, null);
        this.f14118c = Collections.emptyList();
        this.f14119d = d.f13971g;
        this.f14120e = 0.0533f;
        this.f14121f = 0;
        this.f14122g = 0.08f;
        c cVar = new c(context);
        this.f14116a = cVar;
        ?? webView = new WebView(context, null);
        this.f14117b = webView;
        webView.setBackgroundColor(0);
        addView(cVar);
        addView(webView);
    }

    @Override // d7.n0
    public final void a(List list, d dVar, float f10, int i10, float f11) {
        this.f14119d = dVar;
        this.f14120e = f10;
        this.f14121f = i10;
        this.f14122g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            d5.b bVar = (d5.b) list.get(i11);
            if (bVar.f13906d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f14118c.isEmpty() || !arrayList2.isEmpty()) {
            this.f14118c = arrayList2;
            c();
        }
        this.f14116a.a(arrayList, dVar, f10, i10, f11);
        invalidate();
    }

    public final String b(int i10, float f10) {
        float W = yk.g.W(f10, i10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (W == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(W / getContext().getResources().getDisplayMetrics().density)};
        int i11 = e5.x.f15050a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x01e6, code lost:
    
        if (r8 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01e9, code lost:
    
        r24 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01eb, code lost:
    
        r26 = "top";
        r8 = 2;
        r25 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01f1, code lost:
    
        if (r8 != 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.t0.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f14118c.isEmpty()) {
            c();
        }
    }
}
