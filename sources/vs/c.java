package vs;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import com.takusemba.cropme.CropLayout;
import e.l;
import kotlin.jvm.internal.Intrinsics;
import m.h2;
import ws.h;
import ws.i;

/* loaded from: classes2.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CropLayout f38296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f38297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f38298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f38299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f38300e;

    public c(CropLayout cropLayout, float f10, float f11, float f12, ViewTreeObserver viewTreeObserver) {
        this.f38296a = cropLayout;
        this.f38297b = f10;
        this.f38298c = f11;
        this.f38299d = f12;
        this.f38300e = viewTreeObserver;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [m.w, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        CropLayout cropLayout = this.f38296a;
        float measuredWidth = cropLayout.getMeasuredWidth();
        float measuredHeight = cropLayout.getMeasuredHeight();
        float measuredWidth2 = cropLayout.getMeasuredWidth() * this.f38297b;
        float measuredHeight2 = cropLayout.getMeasuredHeight() * this.f38298c;
        RectF rectF = new RectF((measuredWidth - measuredWidth2) / 2.0f, (measuredHeight - measuredHeight2) / 2.0f, (measuredWidth + measuredWidth2) / 2.0f, (measuredHeight + measuredHeight2) / 2.0f);
        b target = cropLayout.f12120a;
        target.setFrame(rectF);
        target.requestLayout();
        d trackPad = cropLayout.f12121b;
        trackPad.setFrame(rectF);
        trackPad.requestLayout();
        cropLayout.f12122c = rectF;
        Intrinsics.e(target, "target");
        float f10 = rectF.left;
        float f11 = rectF.right;
        float f12 = this.f38299d;
        ws.c cVar = new ws.c(new ws.e(target, f10, f11, f12), new i(target, rectF.top, rectF.bottom, f12), new h(target, f12));
        Intrinsics.e(trackPad, "trackPad");
        ?? obj = new Object();
        obj.f25764e = trackPad;
        obj.f25765f = cVar;
        obj.f25760a = new pm.b(obj, 3);
        obj.f25761b = new ws.b(obj);
        obj.f25762c = new l(((View) obj.f25764e).getContext(), (pm.b) obj.f25760a, 0);
        obj.f25763d = new ScaleGestureDetector(((View) obj.f25764e).getContext(), (ws.b) obj.f25761b);
        ((View) obj.f25764e).setOnTouchListener(new h2(obj, 2));
        ViewTreeObserver vto = this.f38300e;
        Intrinsics.b(vto, "vto");
        if (vto.isAlive()) {
            vto.removeOnPreDrawListener(this);
            return true;
        }
        trackPad.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
