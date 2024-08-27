package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25748a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f25749b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f25750c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25751d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25752e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25753f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f25754g;

    public /* synthetic */ v(TextView textView, int i10) {
        this.f25748a = i10;
        this.f25754g = textView;
    }

    public final void a() {
        TextView textView = this.f25754g;
        Drawable a10 = h4.c.a((CompoundButton) textView);
        if (a10 != null) {
            if (this.f25751d || this.f25752e) {
                Drawable mutate = a10.mutate();
                if (this.f25751d) {
                    v3.b.h(mutate, this.f25749b);
                }
                if (this.f25752e) {
                    v3.b.i(mutate, this.f25750c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.f25754g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f25751d || this.f25752e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f25751d) {
                    v3.b.h(mutate, this.f25749b);
                }
                if (this.f25752e) {
                    v3.b.i(mutate, this.f25750c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[Catch: all -> 0x004e, TryCatch #3 {all -> 0x004e, blocks: (B:5:0x0030, B:7:0x0036, B:10:0x003c, B:11:0x006d, B:13:0x0073, B:14:0x007d, B:16:0x0083, B:23:0x0050, B:25:0x0056, B:27:0x005c), top: B:4:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:5:0x0030, B:7:0x0036, B:10:0x003c, B:11:0x006d, B:13:0x0073, B:14:0x007d, B:16:0x0083, B:23:0x0050, B:25:0x0056, B:27:0x005c), top: B:4:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8 A[Catch: all -> 0x00d3, TryCatch #1 {all -> 0x00d3, blocks: (B:33:0x00b5, B:35:0x00bb, B:38:0x00c1, B:39:0x00f2, B:41:0x00f8, B:42:0x0102, B:44:0x0108, B:50:0x00d5, B:52:0x00db, B:54:0x00e1), top: B:32:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108 A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #1 {all -> 0x00d3, blocks: (B:33:0x00b5, B:35:0x00bb, B:38:0x00c1, B:39:0x00f2, B:41:0x00f8, B:42:0x0102, B:44:0x0108, B:50:0x00d5, B:52:0x00db, B:54:0x00e1), top: B:32:0x00b5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.v.c(android.util.AttributeSet, int):void");
    }
}
