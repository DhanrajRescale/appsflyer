package ik;

import ak.e0;
import android.content.Context;
import android.net.Uri;
import bk.d;
import wj.e;
import xj.k;
import xj.m;

/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20090a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20091b;

    public c(d dVar) {
        this.f20091b = dVar;
    }

    @Override // xj.m
    public final e0 a(Object obj, int i10, int i11, k kVar) {
        switch (this.f20090a) {
            case 0:
                return c((Uri) obj);
            default:
                return hk.c.e(((e) ((wj.a) obj)).b(), (d) this.f20091b);
        }
    }

    @Override // xj.m
    public final boolean b(Object obj, k kVar) {
        switch (this.f20090a) {
            case 0:
                return ((Uri) obj).getScheme().equals("android.resource");
            default:
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ak.e0 c(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            java.lang.Object r1 = r7.f20091b
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = r2.getPackageName()
            boolean r3 = r0.equals(r3)
            r4 = 0
            if (r3 == 0) goto L16
        L14:
            r0 = r2
            goto L29
        L16:
            android.content.Context r1 = (android.content.Context) r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            android.content.Context r0 = r1.createPackageContext(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d
            goto L29
        L1d:
            r1 = move-exception
            java.lang.String r3 = r2.getPackageName()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto La4
            goto L14
        L29:
            java.util.List r1 = r8.getPathSegments()
            int r3 = r1.size()
            r5 = 2
            r6 = 1
            if (r3 != r5) goto L6c
            java.util.List r1 = r8.getPathSegments()
            java.lang.String r3 = r8.getAuthority()
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            android.content.res.Resources r6 = r0.getResources()
            int r3 = r6.getIdentifier(r1, r5, r3)
            if (r3 != 0) goto L5d
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            java.lang.String r6 = "android"
            int r3 = r3.getIdentifier(r1, r5, r6)
        L5d:
            if (r3 == 0) goto L60
            goto L82
        L60:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find resource id for: "
            java.lang.String r8 = jr.h.p(r1, r8)
            r0.<init>(r8)
            throw r0
        L6c:
            int r1 = r1.size()
            java.lang.String r3 = "Unrecognized Uri format: "
            if (r1 != r6) goto L9a
            java.util.List r1 = r8.getPathSegments()
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.NumberFormatException -> L8f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L8f
            int r3 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L8f
        L82:
            r8 = 0
            android.graphics.drawable.Drawable r0 = bl.j.C(r2, r0, r3, r8)
            if (r0 == 0) goto L8e
            ik.b r8 = new ik.b
            r8.<init>(r0, r4)
        L8e:
            return r8
        L8f:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r8 = jr.h.p(r3, r8)
            r1.<init>(r8, r0)
            throw r1
        L9a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = jr.h.p(r3, r8)
            r0.<init>(r8)
            throw r0
        La4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed to obtain context or unrecognized Uri format for: "
            java.lang.String r8 = jr.h.p(r2, r8)
            r0.<init>(r8, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.c.c(android.net.Uri):ak.e0");
    }

    public c(Context context) {
        this.f20091b = context.getApplicationContext();
    }
}
