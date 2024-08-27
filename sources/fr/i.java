package fr;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new zq.c(4);

    /* renamed from: a, reason: collision with root package name */
    public long f16224a;

    /* renamed from: b, reason: collision with root package name */
    public long f16225b;

    public i() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long a() {
        return new i().f16225b - this.f16225b;
    }

    public final long b(i iVar) {
        return iVar.f16225b - this.f16225b;
    }

    public final long c() {
        return this.f16224a;
    }

    public final void d() {
        this.f16224a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f16225b = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16224a);
        parcel.writeLong(this.f16225b);
    }

    public i(long j10, long j11) {
        this.f16224a = j10;
        this.f16225b = j11;
    }
}
