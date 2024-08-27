package ip;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.flipkart.youtubeview.activity.YouTubeActivity;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.internal.w$a;
import ek.h0;
import ek.u;
import jp.k;
import jp.l;
import jp.q;
import jp.r;
import jp.s;
import jp.t;
import jp.w;
import ll.o;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f20476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ YouTubePlayerView f20477b;

    public f(YouTubePlayerView youTubePlayerView, c cVar) {
        this.f20477b = youTubePlayerView;
        this.f20476a = cVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, jp.t] */
    public final void a() {
        boolean z10;
        Bundle bundle;
        String str;
        YouTubePlayerView youTubePlayerView = this.f20477b;
        l lVar = youTubePlayerView.f11618d;
        if (lVar != null) {
            Activity activity = this.f20476a;
            try {
                jp.a.f21532a.getClass();
                jp.d a10 = jp.a.a(activity, lVar);
                l lVar2 = youTubePlayerView.f11618d;
                ?? obj = new Object();
                if (lVar2 != null) {
                    obj.f21564a = lVar2;
                    if (a10 != null) {
                        obj.f21565b = a10;
                        youTubePlayerView.f11619e = obj;
                        try {
                            View view = (View) w.i(((jp.b) a10).r());
                            youTubePlayerView.f11620f = view;
                            youTubePlayerView.addView(view);
                            youTubePlayerView.removeView(youTubePlayerView.f11621g);
                            c cVar = youTubePlayerView.f11617c.f20463a;
                            YouTubePlayerView youTubePlayerView2 = cVar.f20465b;
                            if (youTubePlayerView2 != null && youTubePlayerView2 != youTubePlayerView) {
                                youTubePlayerView2.f11624j = true;
                                t tVar = youTubePlayerView2.f11619e;
                                if (tVar != null) {
                                    tVar.a(true);
                                }
                            }
                            cVar.f20465b = youTubePlayerView;
                            if (cVar.f20466c > 0) {
                                youTubePlayerView.c();
                            }
                            int i10 = 2;
                            if (cVar.f20466c >= 2) {
                                youTubePlayerView.d();
                            }
                            if (youTubePlayerView.f11623i != null) {
                                Bundle bundle2 = youTubePlayerView.f11622h;
                                if (bundle2 != null) {
                                    t tVar2 = youTubePlayerView.f11619e;
                                    tVar2.getClass();
                                    try {
                                        z10 = ((jp.b) tVar2.f21565b).n(bundle2);
                                        youTubePlayerView.f11622h = null;
                                    } catch (RemoteException e10) {
                                        throw new RuntimeException(e10);
                                    }
                                } else {
                                    z10 = false;
                                }
                                e eVar = youTubePlayerView.f11623i;
                                t tVar3 = youTubePlayerView.f11619e;
                                YouTubeActivity youTubeActivity = (YouTubeActivity) eVar;
                                youTubeActivity.f10968f = tVar3;
                                tVar3.getClass();
                                jp.d dVar = tVar3.f21565b;
                                try {
                                    jp.b bVar = (jp.b) dVar;
                                    bVar.getClass();
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                                        obtain.writeString("DEFAULT");
                                        bVar.f21533a.transact(23, obtain, obtain2, 0);
                                        obtain2.readException();
                                        t tVar4 = youTubeActivity.f10968f;
                                        tVar4.getClass();
                                        try {
                                            jp.b bVar2 = (jp.b) tVar4.f21565b;
                                            bVar2.getClass();
                                            obtain = Parcel.obtain();
                                            obtain2 = Parcel.obtain();
                                            try {
                                                obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                                                obtain.writeInt(1);
                                                bVar2.f21533a.transact(24, obtain, obtain2, 0);
                                                obtain2.readException();
                                                youTubeActivity.f10968f.b(1);
                                                youTubeActivity.f10968f.b(2);
                                                t tVar5 = youTubeActivity.f10968f;
                                                o oVar = new o(youTubeActivity, i10);
                                                tVar5.getClass();
                                                try {
                                                    ((jp.b) tVar5.f21565b).l(new s(oVar));
                                                    t tVar6 = youTubeActivity.f10968f;
                                                    h0 h0Var = new h0(youTubeActivity, 6);
                                                    tVar6.getClass();
                                                    try {
                                                        ((jp.b) tVar6.f21565b).k(new r(h0Var));
                                                        try {
                                                            ((jp.b) dVar).j(new q(new u(youTubeActivity, 7)));
                                                            if (!z10) {
                                                                t tVar7 = youTubeActivity.f10968f;
                                                                if (youTubeActivity.getIntent() != null) {
                                                                    bundle = youTubeActivity.getIntent().getExtras();
                                                                } else {
                                                                    bundle = null;
                                                                }
                                                                if (bundle != null) {
                                                                    str = bundle.getString("videoId");
                                                                } else {
                                                                    str = null;
                                                                }
                                                                tVar7.getClass();
                                                                try {
                                                                    ((jp.b) tVar7.f21565b).o(str);
                                                                } catch (RemoteException e11) {
                                                                    throw new RuntimeException(e11);
                                                                }
                                                            }
                                                            youTubePlayerView.f11623i = null;
                                                        } catch (RemoteException e12) {
                                                            throw new RuntimeException(e12);
                                                        }
                                                    } catch (RemoteException e13) {
                                                        throw new RuntimeException(e13);
                                                    }
                                                } catch (RemoteException e14) {
                                                    throw new RuntimeException(e14);
                                                }
                                            } finally {
                                            }
                                        } catch (RemoteException e15) {
                                            throw new RuntimeException(e15);
                                        }
                                    } finally {
                                    }
                                } catch (RemoteException e16) {
                                    throw new RuntimeException(e16);
                                }
                            }
                        } catch (RemoteException e17) {
                            throw new RuntimeException(e17);
                        }
                    } else {
                        throw new NullPointerException("embeddedPlayer cannot be null");
                    }
                } else {
                    throw new NullPointerException("connectionClient cannot be null");
                }
            } catch (w$a e18) {
                Log.e("YouTubeAndroidPlayerAPI", "Error creating YouTubePlayerView", e18);
                youTubePlayerView.a();
            }
        }
        youTubePlayerView.f11618d = null;
    }

    public final void b() {
        t tVar;
        YouTubePlayerView youTubePlayerView = this.f20477b;
        if (!youTubePlayerView.f11624j && (tVar = youTubePlayerView.f11619e) != null) {
            tVar.getClass();
            try {
                jp.b bVar = (jp.b) tVar.f21565b;
                bVar.getClass();
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    bVar.f21533a.transact(38, obtain, obtain2, 0);
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
        k kVar = youTubePlayerView.f11621g;
        kVar.f21539a.setVisibility(8);
        kVar.f21540b.setVisibility(8);
        if (youTubePlayerView.indexOfChild(youTubePlayerView.f11621g) < 0) {
            youTubePlayerView.addView(youTubePlayerView.f11621g);
            youTubePlayerView.removeView(youTubePlayerView.f11620f);
        }
        youTubePlayerView.f11620f = null;
        youTubePlayerView.f11619e = null;
        youTubePlayerView.f11618d = null;
    }
}
