package xk;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.facebook.FacebookException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f40458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40459b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40460c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40461d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40462e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40463f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f40464g;

    /* renamed from: h, reason: collision with root package name */
    public final String f40465h;

    /* renamed from: i, reason: collision with root package name */
    public final FacebookException f40466i;

    /* renamed from: j, reason: collision with root package name */
    public static final ek.e f40456j = new ek.e(15, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final d4.c0 f40457k = new d4.c0(200, 299);

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new zi.j(6);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r2.contains(java.lang.Integer.valueOf(r3)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(int r1, int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Object r8, com.facebook.FacebookException r9, boolean r10) {
        /*
            r0 = this;
            r0.<init>()
            r0.f40458a = r1
            r0.f40459b = r2
            r0.f40460c = r3
            r0.f40461d = r4
            r0.f40462e = r6
            r0.f40463f = r7
            r0.f40464g = r8
            r0.f40465h = r5
            xk.p r1 = xk.p.f40453b
            ek.e r4 = xk.q.f40456j
            if (r9 == 0) goto L1d
            r0.f40466i = r9
            goto La7
        L1d:
            com.facebook.FacebookServiceException r5 = new com.facebook.FacebookServiceException
            java.lang.String r6 = r0.a()
            r5.<init>(r0, r6)
            r0.f40466i = r5
            nl.p r5 = r4.q()
            xk.p r6 = xk.p.f40454c
            if (r10 == 0) goto L36
            r5.getClass()
        L33:
            r1 = r6
            goto La7
        L36:
            java.util.Map r7 = r5.f28897a
            if (r7 == 0) goto L5b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r8 = r7.containsKey(r8)
            if (r8 == 0) goto L5b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto La7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L5b
            goto La7
        L5b:
            java.util.Map r7 = r5.f28899c
            if (r7 == 0) goto L82
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r8 = r7.containsKey(r8)
            if (r8 == 0) goto L82
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L7f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L82
        L7f:
            xk.p r1 = xk.p.f40452a
            goto La7
        L82:
            java.util.Map r5 = r5.f28898b
            if (r5 == 0) goto La7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r7 = r5.containsKey(r7)
            if (r7 == 0) goto La7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r5.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L33
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto La7
            goto L33
        La7:
            nl.p r2 = r4.q()
            r2.getClass()
            int[] r2 = nl.o.f28893a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.q.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, com.facebook.FacebookException, boolean):void");
    }

    public final String a() {
        String str = this.f40465h;
        if (str == null) {
            FacebookException facebookException = this.f40466i;
            if (facebookException == null) {
                return null;
            }
            return facebookException.getLocalizedMessage();
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f40458a + ", errorCode: " + this.f40459b + ", subErrorCode: " + this.f40460c + ", errorType: " + this.f40461d + ", errorMessage: " + a() + UrlTreeKt.componentParamSuffix;
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f40458a);
        out.writeInt(this.f40459b);
        out.writeInt(this.f40460c);
        out.writeString(this.f40461d);
        out.writeString(a());
        out.writeString(this.f40462e);
        out.writeString(this.f40463f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.facebook.FacebookException] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public q(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new RuntimeException(exc), false);
    }

    public q(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, false);
    }
}
