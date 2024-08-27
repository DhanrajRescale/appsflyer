package jp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.flipkart.youtubeview.activity.YouTubeActivity;
import ek.h0;

/* loaded from: classes2.dex */
public final class r extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f21562a;

    public r(h0 h0Var) {
        this.f21562a = h0Var;
        attachInterface(this, "com.google.android.youtube.player.internal.IPlayerStateChangeListener");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1598968902) {
            h0 h0Var = this.f21562a;
            switch (i10) {
                case 1:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    h0Var.getClass();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    parcel.readString();
                    h0Var.getClass();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    h0Var.getClass();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    h0Var.getClass();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    YouTubeActivity youTubeActivity = (YouTubeActivity) h0Var.f15593b;
                    int i12 = YouTubeActivity.f10966g;
                    youTubeActivity.b();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    try {
                        da.e.G(parcel.readString());
                    } catch (IllegalArgumentException | NullPointerException unused) {
                    }
                    h0Var.getClass();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
        parcel2.writeString("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
        return true;
    }
}
