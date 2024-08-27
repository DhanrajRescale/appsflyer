package fu;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f16252b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f16253c;

    /* renamed from: d, reason: collision with root package name */
    public int f16254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f16255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f16255e = eVar;
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r0.length == 0) goto L31;
     */
    @Override // fu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File a() {
        /*
            r11 = this;
            boolean r0 = r11.f16252b
            r1 = 0
            fu.e r2 = r11.f16255e
            java.io.File r3 = r11.f16258a
            if (r0 != 0) goto L20
            fu.g r0 = r2.f16257d
            kotlin.jvm.functions.Function1 r0 = r0.f16261c
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.invoke(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1c
            return r1
        L1c:
            r0 = 1
            r11.f16252b = r0
            return r3
        L20:
            java.io.File[] r0 = r11.f16253c
            if (r0 == 0) goto L37
            int r4 = r11.f16254d
            kotlin.jvm.internal.Intrinsics.c(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L2d
            goto L37
        L2d:
            fu.g r0 = r2.f16257d
            kotlin.jvm.functions.Function1 r0 = r0.f16262d
            if (r0 == 0) goto L36
            r0.invoke(r3)
        L36:
            return r1
        L37:
            java.io.File[] r0 = r11.f16253c
            if (r0 != 0) goto L6d
            java.io.File[] r0 = r3.listFiles()
            r11.f16253c = r0
            if (r0 != 0) goto L59
            fu.g r0 = r2.f16257d
            kotlin.jvm.functions.Function2 r0 = r0.f16263e
            if (r0 == 0) goto L59
            kotlin.io.AccessDeniedException r10 = new kotlin.io.AccessDeniedException
            java.io.File r5 = r11.f16258a
            r6 = 0
            java.lang.String r7 = "Cannot list files in a directory"
            r8 = 2
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.invoke(r3, r10)
        L59:
            java.io.File[] r0 = r11.f16253c
            if (r0 == 0) goto L63
            kotlin.jvm.internal.Intrinsics.c(r0)
            int r0 = r0.length
            if (r0 != 0) goto L6d
        L63:
            fu.g r0 = r2.f16257d
            kotlin.jvm.functions.Function1 r0 = r0.f16262d
            if (r0 == 0) goto L6c
            r0.invoke(r3)
        L6c:
            return r1
        L6d:
            java.io.File[] r0 = r11.f16253c
            kotlin.jvm.internal.Intrinsics.c(r0)
            int r1 = r11.f16254d
            int r2 = r1 + 1
            r11.f16254d = r2
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fu.d.a():java.io.File");
    }
}
