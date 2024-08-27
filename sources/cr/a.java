package cr;

import android.os.Parcel;
import android.os.Parcelable;
import fr.i;
import gr.v;
import gr.w;
import java.util.List;
import ll.e;
import zq.c;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new c(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f13071a;

    /* renamed from: b, reason: collision with root package name */
    public final i f13072b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13073c;

    public a(e eVar, String str) {
        this.f13073c = false;
        this.f13071a = str;
        this.f13072b = new i();
    }

    public static w[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        w[] wVarArr = new w[list.size()];
        w a10 = ((a) list.get(0)).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            w a11 = ((a) list.get(i10)).a();
            if (!z10 && ((a) list.get(i10)).f13073c) {
                wVarArr[0] = a11;
                wVarArr[i10] = a10;
                z10 = true;
            } else {
                wVarArr[i10] = a11;
            }
        }
        if (!z10) {
            wVarArr[0] = a10;
        }
        return wVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (vq.a.p(r6) != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r5v3, types: [vq.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static cr.a c() {
        /*
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "-"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            cr.a r1 = new cr.a
            ll.e r2 = new ll.e
            r3 = 18
            r2.<init>(r3)
            r1.<init>(r2, r0)
            vq.a r0 = vq.a.e()
            boolean r2 = r0.o()
            if (r2 == 0) goto Ld1
            double r2 = java.lang.Math.random()
            java.lang.Class<vq.s> r4 = vq.s.class
            monitor-enter(r4)
            vq.s r5 = vq.s.f38270b     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L3c
            vq.s r5 = new vq.s     // Catch: java.lang.Throwable -> L39
            r5.<init>()     // Catch: java.lang.Throwable -> L39
            vq.s.f38270b = r5     // Catch: java.lang.Throwable -> L39
            goto L3c
        L39:
            r0 = move-exception
            goto Lcf
        L3c:
            vq.s r5 = vq.s.f38270b     // Catch: java.lang.Throwable -> L39
            monitor-exit(r4)
            fr.d r4 = r0.i(r5)
            boolean r6 = r4.b()
            if (r6 == 0) goto L5d
            java.lang.Object r4 = r4.a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r6 = r4.doubleValue()
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r8
            boolean r4 = vq.a.p(r6)
            if (r4 == 0) goto L5d
            goto Lc9
        L5d:
            com.google.firebase.perf.config.RemoteConfigManager r4 = r0.f38250a
            java.lang.String r6 = "fpr_vc_session_sampling_rate"
            fr.d r4 = r4.getDouble(r6)
            boolean r6 = r4.b()
            if (r6 == 0) goto L97
            java.lang.Object r6 = r4.a()
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            boolean r6 = vq.a.p(r6)
            if (r6 == 0) goto L97
            vq.w r0 = r0.f38252c
            java.lang.String r5 = "com.google.firebase.perf.SessionSamplingRate"
            java.lang.Object r6 = r4.a()
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            r0.e(r5, r6)
            java.lang.Object r0 = r4.a()
            java.lang.Double r0 = (java.lang.Double) r0
            double r6 = r0.doubleValue()
            goto Lc9
        L97:
            fr.d r0 = r0.b(r5)
            boolean r4 = r0.b()
            if (r4 == 0) goto Lbc
            java.lang.Object r4 = r0.a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            boolean r4 = vq.a.p(r4)
            if (r4 == 0) goto Lbc
            java.lang.Object r0 = r0.a()
            java.lang.Double r0 = (java.lang.Double) r0
            double r6 = r0.doubleValue()
            goto Lc9
        Lbc:
            r4 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            double r6 = r0.doubleValue()
        Lc9:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Ld1
            r0 = 1
            goto Ld2
        Lcf:
            monitor-exit(r4)
            throw r0
        Ld1:
            r0 = 0
        Ld2:
            r1.f13073c = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cr.a.c():cr.a");
    }

    public final w a() {
        v z10 = w.z();
        z10.i();
        w.v((w) z10.f11975b, this.f13071a);
        if (this.f13073c) {
            z10.i();
            w.w((w) z10.f11975b);
        }
        return (w) z10.g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13071a);
        parcel.writeByte(this.f13073c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f13072b, 0);
    }

    public a(Parcel parcel) {
        this.f13073c = false;
        this.f13071a = parcel.readString();
        this.f13073c = parcel.readByte() != 0;
        this.f13072b = (i) parcel.readParcelable(i.class.getClassLoader());
    }
}
