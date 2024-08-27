package aq;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzade;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class g0 extends zp.h {
    public static final Parcelable.Creator<g0> CREATOR = new com.google.android.material.datepicker.a(15);

    /* renamed from: a, reason: collision with root package name */
    public zzade f2716a;

    /* renamed from: b, reason: collision with root package name */
    public e0 f2717b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2718c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2719d;

    /* renamed from: e, reason: collision with root package name */
    public List f2720e;

    /* renamed from: f, reason: collision with root package name */
    public List f2721f;

    /* renamed from: g, reason: collision with root package name */
    public String f2722g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f2723h;

    /* renamed from: i, reason: collision with root package name */
    public h0 f2724i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2725j;

    /* renamed from: k, reason: collision with root package name */
    public zp.d0 f2726k;

    /* renamed from: l, reason: collision with root package name */
    public o f2727l;

    public g0(zzade zzadeVar, e0 e0Var, String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, Boolean bool, h0 h0Var, boolean z10, zp.d0 d0Var, o oVar) {
        this.f2716a = zzadeVar;
        this.f2717b = e0Var;
        this.f2718c = str;
        this.f2719d = str2;
        this.f2720e = arrayList;
        this.f2721f = arrayList2;
        this.f2722g = str3;
        this.f2723h = bool;
        this.f2724i = h0Var;
        this.f2725j = z10;
        this.f2726k = d0Var;
        this.f2727l = oVar;
    }

    @Override // zp.h
    public final String J() {
        Map map;
        zzade zzadeVar = this.f2716a;
        if (zzadeVar == null || zzadeVar.zze() == null || (map = (Map) m.a(zzadeVar.zze()).f14051b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // zp.h
    public final boolean R() {
        String str;
        Boolean bool = this.f2723h;
        if (bool == null || bool.booleanValue()) {
            zzade zzadeVar = this.f2716a;
            if (zzadeVar != null) {
                Map map = (Map) m.a(zzadeVar.zze()).f14051b.get("firebase");
                if (map != null) {
                    str = (String) map.get("sign_in_provider");
                } else {
                    str = null;
                }
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            boolean z10 = false;
            if (this.f2720e.size() <= 1 && (str == null || !str.equals("custom"))) {
                z10 = true;
            }
            this.f2723h = Boolean.valueOf(z10);
        }
        return this.f2723h.booleanValue();
    }

    @Override // zp.h
    public final synchronized g0 U(List list) {
        try {
            Preconditions.checkNotNull(list);
            this.f2720e = new ArrayList(list.size());
            this.f2721f = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                zp.w wVar = (zp.w) list.get(i10);
                if (wVar.b().equals("firebase")) {
                    this.f2717b = (e0) wVar;
                } else {
                    this.f2721f.add(wVar.b());
                }
                this.f2720e.add((e0) wVar);
            }
            if (this.f2717b == null) {
                this.f2717b = (e0) this.f2720e.get(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // zp.h
    public final void X(ArrayList arrayList) {
        o oVar;
        if (arrayList.isEmpty()) {
            oVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zp.l lVar = (zp.l) it.next();
                if (lVar instanceof zp.t) {
                    arrayList2.add((zp.t) lVar);
                } else if (lVar instanceof zp.c0) {
                    arrayList3.add((zp.c0) lVar);
                }
            }
            oVar = new o(arrayList2, arrayList3);
        }
        this.f2727l = oVar;
    }

    @Override // zp.w
    public final String b() {
        return this.f2717b.f2703b;
    }

    @Override // zp.h
    public final Uri getPhotoUrl() {
        e0 e0Var = this.f2717b;
        String str = e0Var.f2705d;
        if (!TextUtils.isEmpty(str) && e0Var.f2706e == null) {
            e0Var.f2706e = Uri.parse(str);
        }
        return e0Var.f2706e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f2716a, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f2717b, i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.f2718c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f2719d, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f2720e, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f2721f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f2722g, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(R()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f2724i, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f2725j);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f2726k, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f2727l, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public g0(pp.g gVar, ArrayList arrayList) {
        Preconditions.checkNotNull(gVar);
        gVar.a();
        this.f2718c = gVar.f31272b;
        this.f2719d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f2722g = "2";
        U(arrayList);
    }
}
