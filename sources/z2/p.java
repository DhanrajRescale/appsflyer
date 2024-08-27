package z2;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends androidx.activity.o {

    /* renamed from: d, reason: collision with root package name */
    public Function0 f41945d;

    /* renamed from: e, reason: collision with root package name */
    public o f41946e;

    /* renamed from: f, reason: collision with root package name */
    public final View f41947f;

    /* renamed from: g, reason: collision with root package name */
    public final n f41948g;

    /* renamed from: h, reason: collision with root package name */
    public final int f41949h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(kotlin.jvm.functions.Function0 r6, z2.o r7, android.view.View r8, w2.k r9, w2.b r10, java.util.UUID r11) {
        /*
            r5 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r8.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto Lf
            r7.getClass()
        Lf:
            r3 = 2132082999(0x7f150137, float:1.9806128E38)
            r0.<init>(r1, r3)
            r1 = 0
            r5.<init>(r0, r1)
            r5.f41945d = r6
            r5.f41946e = r7
            r5.f41947f = r8
            r6 = 8
            float r6 = (float) r6
            android.view.Window r7 = r5.getWindow()
            if (r7 == 0) goto Lb9
            android.view.WindowManager$LayoutParams r0 = r7.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r5.f41949h = r0
            r0 = 1
            r7.requestFeature(r0)
            r3 = 17170445(0x106000d, float:2.461195E-38)
            r7.setBackgroundDrawableResource(r3)
            z2.o r3 = r5.f41946e
            r3.getClass()
            r3 = 30
            if (r2 < r3) goto L49
            d4.f2.a(r7, r0)
            goto L4c
        L49:
            d4.e2.a(r7, r0)
        L4c:
            z2.n r2 = new z2.n
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3, r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Dialog:"
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r3 = 2131362319(0x7f0a020f, float:1.8344415E38)
            r2.setTag(r3, r11)
            r2.setClipChildren(r1)
            float r6 = r10.c0(r6)
            r2.setElevation(r6)
            o0.j r6 = new o0.j
            r10 = 2
            r6.<init>(r10)
            r2.setOutlineProvider(r6)
            r5.f41948g = r2
            android.view.View r6 = r7.getDecorView()
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L89
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L8a
        L89:
            r6 = 0
        L8a:
            if (r6 == 0) goto L8f
            e(r6)
        L8f:
            r5.setContentView(r2)
            androidx.lifecycle.t r6 = yk.j.W0(r8)
            yk.j.r1(r2, r6)
            androidx.lifecycle.i1 r6 = qu.i0.r(r8)
            qu.i0.H(r2, r6)
            o7.f r6 = yk.g.w(r8)
            yk.g.Z(r2, r6)
            kotlin.jvm.functions.Function0 r6 = r5.f41945d
            z2.o r7 = r5.f41946e
            r5.f(r6, r7, r9)
            androidx.activity.w r6 = r5.f863c
            z2.a r7 = new z2.a
            r7.<init>(r5, r0)
            iu.j.i(r6, r5, r7)
            return
        Lb9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Dialog has no window"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.p.<init>(kotlin.jvm.functions.Function0, z2.o, android.view.View, w2.k, w2.b, java.util.UUID):void");
    }

    public static final void e(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof n) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) childAt;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void f(Function0 function0, o oVar, w2.k kVar) {
        int i10;
        int i11;
        Window window;
        Window window2;
        this.f41945d = function0;
        this.f41946e = oVar;
        oVar.getClass();
        boolean b10 = i.b(this.f41947f);
        Window window3 = getWindow();
        Intrinsics.c(window3);
        if (b10) {
            i10 = 8192;
        } else {
            i10 = -8193;
        }
        window3.setFlags(i10, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int ordinal = kVar.ordinal();
        if (ordinal != 0) {
            i11 = 1;
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i11 = 0;
        }
        n nVar = this.f41948g;
        nVar.setLayoutDirection(i11);
        boolean z10 = oVar.f41944c;
        if (z10 && !nVar.f41940k && (window2 = getWindow()) != null) {
            window2.setLayout(-2, -2);
        }
        nVar.f41940k = z10;
        if (Build.VERSION.SDK_INT < 31 && (window = getWindow()) != null) {
            window.setSoftInputMode(this.f41949h);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f41946e.f41943b) {
            this.f41945d.mo2invoke();
        }
        return onTouchEvent;
    }
}
