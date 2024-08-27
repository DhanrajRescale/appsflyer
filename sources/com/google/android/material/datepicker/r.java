package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class r implements Comparable, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f11327a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11329c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11330d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11331e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11332f;

    /* renamed from: g, reason: collision with root package name */
    public String f11333g;

    public r(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = y.b(calendar);
        this.f11327a = b10;
        this.f11328b = b10.get(2);
        this.f11329c = b10.get(1);
        this.f11330d = b10.getMaximum(7);
        this.f11331e = b10.getActualMaximum(5);
        this.f11332f = b10.getTimeInMillis();
    }

    public static r a(int i10, int i11) {
        Calendar d10 = y.d(null);
        d10.set(1, i10);
        d10.set(2, i11);
        return new r(d10);
    }

    public static r b(long j10) {
        Calendar d10 = y.d(null);
        d10.setTimeInMillis(j10);
        return new r(d10);
    }

    public final String c() {
        if (this.f11333g == null) {
            this.f11333g = y.a("yMMMM", Locale.getDefault()).format(new Date(this.f11327a.getTimeInMillis()));
        }
        return this.f11333g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11327a.compareTo(((r) obj).f11327a);
    }

    public final int d(r rVar) {
        if (this.f11327a instanceof GregorianCalendar) {
            return (rVar.f11328b - this.f11328b) + ((rVar.f11329c - this.f11329c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f11328b == rVar.f11328b && this.f11329c == rVar.f11329c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11328b), Integer.valueOf(this.f11329c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11329c);
        parcel.writeInt(this.f11328b);
    }
}
