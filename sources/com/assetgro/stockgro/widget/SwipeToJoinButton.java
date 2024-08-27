package com.assetgro.stockgro.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.assetgro.stockgro.prod.R;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.t;
import org.jetbrains.annotations.NotNull;
import r3.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/widget/SwipeToJoinButton;", "Lm/t;", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SwipeToJoinButton extends t {

    /* renamed from: d, reason: collision with root package name */
    public float f10742d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10743e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f10744f;

    /* renamed from: g, reason: collision with root package name */
    public final float f10745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToJoinButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f10743e = 0.9f;
        Drawable drawable = k.getDrawable(context, R.drawable.swipe_to_join_stub);
        this.f10744f = drawable;
        this.f10745g = getResources().getDisplayMetrics().density * 2.0f;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        Drawable drawable = this.f10744f;
        Intrinsics.c(drawable);
        float intrinsicWidth = width - drawable.getIntrinsicWidth();
        float f10 = this.f10745g;
        float f11 = ((intrinsicWidth - (2 * f10)) * this.f10742d) + f10;
        drawable.setBounds((int) f11, (int) f10, (int) (f11 + drawable.getIntrinsicWidth()), (int) (getHeight() - f10));
        drawable.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0 != 2) goto L17;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto Ld
            r6 = 0
            return r6
        Ld:
            int r0 = r6.getAction()
            r1 = 2
            r2 = 1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L34
            if (r0 == r2) goto L1c
            if (r0 == r1) goto L34
            goto L51
        L1c:
            float r6 = r5.f10742d
            float r0 = r5.f10743e
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 < 0) goto L2a
            r5.f10742d = r3
            super.performClick()
            goto L2d
        L2a:
            r6 = 0
            r5.f10742d = r6
        L2d:
            r5.setAlpha(r3)
            r5.invalidate()
            goto L51
        L34:
            float r6 = r6.getX()
            float r0 = r5.f10745g
            float r6 = r6 - r0
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r1 = (float) r1
            float r1 = r1 * r0
            float r4 = r4 - r1
            float r6 = r6 / r4
            r5.f10742d = r6
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r6 = r6 * r0
            float r3 = r3 - r6
            r5.setAlpha(r3)
            r5.invalidate()
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.widget.SwipeToJoinButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }
}
