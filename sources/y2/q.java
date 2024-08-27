package y2;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q extends k {
    public Function1 A;
    public Function1 B;
    public Function1 C;

    /* renamed from: x, reason: collision with root package name */
    public final View f41134x;

    /* renamed from: y, reason: collision with root package name */
    public final w1.d f41135y;

    /* renamed from: z, reason: collision with root package name */
    public d1.m f41136z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(android.content.Context r9, kotlin.jvm.functions.Function1 r10, t0.v r11, d1.n r12, int r13, c2.r1 r14) {
        /*
            r8 = this;
            java.lang.Object r10 = r10.invoke(r9)
            android.view.View r10 = (android.view.View) r10
            w1.d r7 = new w1.d
            r7.<init>()
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f41134x = r10
            r8.f41135y = r7
            r9 = 0
            r8.setClipChildren(r9)
            java.lang.String r11 = java.lang.String.valueOf(r13)
            r13 = 0
            if (r12 == 0) goto L29
            java.lang.Object r14 = r12.c(r11)
            goto L2a
        L29:
            r14 = r13
        L2a:
            boolean r0 = r14 instanceof android.util.SparseArray
            if (r0 == 0) goto L31
            r13 = r14
            android.util.SparseArray r13 = (android.util.SparseArray) r13
        L31:
            if (r13 == 0) goto L36
            r10.restoreHierarchyState(r13)
        L36:
            if (r12 == 0) goto L44
            y2.p r10 = new y2.p
            r10.<init>(r8, r9)
            d1.m r9 = r12.d(r11, r10)
            r8.setSavableRegistryEntry(r9)
        L44:
            y2.d r9 = y2.d.f41071e
            r8.A = r9
            r8.B = r9
            r8.C = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.q.<init>(android.content.Context, kotlin.jvm.functions.Function1, t0.v, d1.n, int, c2.r1):void");
    }

    public static final void l(q qVar) {
        qVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(d1.m mVar) {
        d1.m mVar2 = this.f41136z;
        if (mVar2 != null) {
            ((d1.o) mVar2).a();
        }
        this.f41136z = mVar;
    }

    @NotNull
    public final w1.d getDispatcher() {
        return this.f41135y;
    }

    @NotNull
    public final Function1<View, Unit> getReleaseBlock() {
        return this.C;
    }

    @NotNull
    public final Function1<View, Unit> getResetBlock() {
        return this.B;
    }

    public /* bridge */ /* synthetic */ d2.a getSubCompositionView() {
        return null;
    }

    @NotNull
    public final Function1<View, Unit> getUpdateBlock() {
        return this.A;
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(@NotNull Function1<View, Unit> function1) {
        this.C = function1;
        setRelease(new p(this, 1));
    }

    public final void setResetBlock(@NotNull Function1<View, Unit> function1) {
        this.B = function1;
        setReset(new p(this, 2));
    }

    public final void setUpdateBlock(@NotNull Function1<View, Unit> function1) {
        this.A = function1;
        setUpdate(new p(this, 3));
    }
}
