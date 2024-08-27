package ip;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.youtube.player.YouTubePlayerView;
import jp.t;

/* loaded from: classes2.dex */
public abstract class c extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public b f20464a;

    /* renamed from: b, reason: collision with root package name */
    public YouTubePlayerView f20465b;

    /* renamed from: c, reason: collision with root package name */
    public int f20466c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f20467d;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20464a = new b(this);
        this.f20467d = bundle != null ? bundle.getBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE") : null;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        YouTubePlayerView youTubePlayerView = this.f20465b;
        if (youTubePlayerView != null) {
            boolean isFinishing = isFinishing();
            t tVar = youTubePlayerView.f11619e;
            if (tVar != null) {
                try {
                    jp.b bVar = (jp.b) tVar.f21565b;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        obtain.writeInt(isFinishing ? 1 : 0);
                        bVar.f21533a.transact(37, obtain, obtain2, 0);
                        obtain2.readException();
                        youTubePlayerView.f11624j = true;
                        t tVar2 = youTubePlayerView.f11619e;
                        if (tVar2 != null) {
                            tVar2.a(isFinishing);
                        }
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        t tVar;
        this.f20466c = 1;
        YouTubePlayerView youTubePlayerView = this.f20465b;
        if (youTubePlayerView != null && (tVar = youTubePlayerView.f11619e) != null) {
            try {
                jp.b bVar = (jp.b) tVar.f21565b;
                bVar.getClass();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    bVar.f21533a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f20466c = 2;
        YouTubePlayerView youTubePlayerView = this.f20465b;
        if (youTubePlayerView != null) {
            youTubePlayerView.d();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        YouTubePlayerView youTubePlayerView = this.f20465b;
        if (youTubePlayerView != null) {
            t tVar = youTubePlayerView.f11619e;
            if (tVar == null) {
                bundle2 = youTubePlayerView.f11622h;
            } else {
                try {
                    bundle2 = ((jp.b) tVar.f21565b).q();
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } else {
            bundle2 = this.f20467d;
        }
        bundle.putBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE", bundle2);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f20466c = 1;
        YouTubePlayerView youTubePlayerView = this.f20465b;
        if (youTubePlayerView != null) {
            youTubePlayerView.c();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        t tVar;
        this.f20466c = 0;
        YouTubePlayerView youTubePlayerView = this.f20465b;
        if (youTubePlayerView != null && (tVar = youTubePlayerView.f11619e) != null) {
            try {
                jp.b bVar = (jp.b) tVar.f21565b;
                bVar.getClass();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    bVar.f21533a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        super.onStop();
    }
}
