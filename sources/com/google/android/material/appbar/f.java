package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class f extends k4.b {
    public static final Parcelable.Creator<f> CREATOR = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f11146c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11147d;

    /* renamed from: e, reason: collision with root package name */
    public int f11148e;

    /* renamed from: f, reason: collision with root package name */
    public float f11149f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11150g;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        boolean z11;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11146c = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11147d = z11;
        this.f11148e = parcel.readInt();
        this.f11149f = parcel.readFloat();
        this.f11150g = parcel.readByte() != 0;
    }

    @Override // k4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22040a, i10);
        parcel.writeByte(this.f11146c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11147d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f11148e);
        parcel.writeFloat(this.f11149f);
        parcel.writeByte(this.f11150g ? (byte) 1 : (byte) 0);
    }
}
