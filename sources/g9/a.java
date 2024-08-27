package g9;

import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17173a = new k(1);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r6 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        r0 = r8.getLayoutManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if ((r0 instanceof androidx.recyclerview.widget.LinearLayoutManager) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0;
        r0 = r0.T0(0, r0.v(), true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (k7.i1.H(r0) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if ((r0 instanceof androidx.recyclerview.widget.GridLayoutManager) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        r0 = (androidx.recyclerview.widget.GridLayoutManager) r0;
        r0 = r0.T0(0, r0.v(), true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r0 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (k7.i1.H(r0) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r6 == r0) goto L28;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            com.afollestad.materialdialogs.internal.list.DialogRecyclerView r8 = (com.afollestad.materialdialogs.internal.list.DialogRecyclerView) r8
            java.lang.String r0 = "$receiver"
            kotlin.jvm.internal.Intrinsics.e(r8, r0)
            int r0 = r8.getChildCount()
            if (r0 == 0) goto L10
            r8.getMeasuredHeight()
        L10:
            int r0 = r8.getChildCount()
            r1 = 2
            if (r0 == 0) goto L9f
            int r0 = r8.getMeasuredHeight()
            if (r0 != 0) goto L1f
            goto L9f
        L1f:
            k7.z0 r0 = r8.getAdapter()
            if (r0 != 0) goto L28
            kotlin.jvm.internal.Intrinsics.j()
        L28:
            java.lang.String r2 = "adapter!!"
            kotlin.jvm.internal.Intrinsics.b(r0, r2)
            int r0 = r0.a()
            r2 = 1
            int r0 = r0 - r2
            k7.i1 r3 = r8.getLayoutManager()
            boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r5 = 0
            r6 = -1
            if (r4 == 0) goto L52
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            int r4 = r3.v()
            int r4 = r4 - r2
            android.view.View r3 = r3.T0(r4, r6, r2, r5)
            if (r3 != 0) goto L4b
            goto L4f
        L4b:
            int r6 = k7.i1.H(r3)
        L4f:
            if (r6 != r0) goto L9e
            goto L6a
        L52:
            boolean r4 = r3 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r4 == 0) goto L9e
            androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
            int r4 = r3.v()
            int r4 = r4 - r2
            android.view.View r3 = r3.T0(r4, r6, r2, r5)
            if (r3 != 0) goto L64
            goto L68
        L64:
            int r6 = k7.i1.H(r3)
        L68:
            if (r6 != r0) goto L9e
        L6a:
            k7.i1 r0 = r8.getLayoutManager()
            boolean r3 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L86
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r3 = r0.v()
            android.view.View r0 = r0.T0(r5, r3, r2, r5)
            if (r0 != 0) goto L7f
            goto L9e
        L7f:
            int r0 = k7.i1.H(r0)
            if (r0 != 0) goto L9e
            goto L9f
        L86:
            boolean r3 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r3 == 0) goto L9e
            androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
            int r3 = r0.v()
            android.view.View r0 = r0.T0(r5, r3, r2, r5)
            if (r0 != 0) goto L97
            goto L9e
        L97:
            int r0 = k7.i1.H(r0)
            if (r0 != 0) goto L9e
            goto L9f
        L9e:
            r1 = r2
        L9f:
            r8.setOverScrollMode(r1)
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.a.invoke(java.lang.Object):java.lang.Object");
    }
}
