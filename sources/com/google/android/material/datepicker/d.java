package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final r f11266a;

    /* renamed from: b, reason: collision with root package name */
    public final r f11267b;

    /* renamed from: c, reason: collision with root package name */
    public final c f11268c;

    /* renamed from: d, reason: collision with root package name */
    public final r f11269d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11270e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11271f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11272g;

    public d(r rVar, r rVar2, c cVar, r rVar3, int i10) {
        Objects.requireNonNull(rVar, "start cannot be null");
        Objects.requireNonNull(rVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f11266a = rVar;
        this.f11267b = rVar2;
        this.f11269d = rVar3;
        this.f11270e = i10;
        this.f11268c = cVar;
        if (rVar3 != null && rVar.f11327a.compareTo(rVar3.f11327a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (rVar3 != null && rVar3.f11327a.compareTo(rVar2.f11327a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 >= 0 && i10 <= y.d(null).getMaximum(7)) {
            this.f11272g = rVar.d(rVar2) + 1;
            this.f11271f = (rVar2.f11329c - rVar.f11329c) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f11266a.equals(dVar.f11266a) && this.f11267b.equals(dVar.f11267b) && c4.c.a(this.f11269d, dVar.f11269d) && this.f11270e == dVar.f11270e && this.f11268c.equals(dVar.f11268c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11266a, this.f11267b, this.f11269d, Integer.valueOf(this.f11270e), this.f11268c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f11266a, 0);
        parcel.writeParcelable(this.f11267b, 0);
        parcel.writeParcelable(this.f11269d, 0);
        parcel.writeParcelable(this.f11268c, 0);
        parcel.writeInt(this.f11270e);
    }
}
