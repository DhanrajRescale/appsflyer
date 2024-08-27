package j5;

import android.os.Bundle;
import b5.j1;
import b5.r0;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.assetgro.stockgro.data.ContactsWorker;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.model.portfolio.WalletFunds;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.splash.SplashActivity;
import com.facebook.FacebookSdk;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import r5.e1;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements e5.j, b5.j, z5.m, k6.h, et.d, et.b, et.c, a4.g, DeepLinkListener, nl.s, xk.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20975a;

    public /* synthetic */ d(int i10) {
        this.f20975a = i10;
    }

    public static s5.d e(int i10, b5.v vVar, boolean z10, ArrayList arrayList, z5.b0 b0Var) {
        int i11;
        z5.p kVar;
        String str = vVar.f3651k;
        if (r0.k(str)) {
            return null;
        }
        if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
            if (z10) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            kVar = new q6.k(i11, arrayList, b0Var);
        } else {
            kVar = new o6.d(1);
        }
        return new s5.d(kVar, i10, vVar);
    }

    @Override // et.b
    public Object a(Object obj, Object obj2) {
        double d10;
        WalletFunds funds;
        switch (this.f20975a) {
            case 10:
                Integer obs = (Integer) obj;
                Intrinsics.checkNotNullParameter(obs, "obs");
                Intrinsics.checkNotNullParameter((Long) obj2, "<anonymous parameter 1>");
                return obs;
            case 11:
                Integer obs2 = (Integer) obj;
                Intrinsics.checkNotNullParameter(obs2, "obs");
                Intrinsics.checkNotNullParameter((Long) obj2, "<anonymous parameter 1>");
                return obs2;
            default:
                BaseResponseDto d12 = (BaseResponseDto) obj;
                BaseResponseDto d22 = (BaseResponseDto) obj2;
                Intrinsics.checkNotNullParameter(d12, "d1");
                Intrinsics.checkNotNullParameter(d22, "d2");
                WalletBalanceResponseDto walletBalanceResponseDto = (WalletBalanceResponseDto) d12.getData();
                if (walletBalanceResponseDto != null && (funds = walletBalanceResponseDto.getFunds()) != null) {
                    d10 = funds.getCash();
                } else {
                    d10 = 0.0d;
                }
                Double valueOf = Double.valueOf(d10);
                Object data = d22.getData();
                Intrinsics.c(data);
                return new Pair(valueOf, data);
        }
    }

    @Override // et.d
    public Object apply(Object obj) {
        androidx.work.t createWork$lambda$3;
        createWork$lambda$3 = ContactsWorker.createWork$lambda$3((Throwable) obj);
        return createWork$lambda$3;
    }

    @Override // et.c
    public void b(Object obj) {
    }

    @Override // b5.j
    public b5.k c(Bundle bundle) {
        boolean z10 = false;
        switch (this.f20975a) {
            case 0:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(e1.f33146e);
                if (parcelableArrayList == null) {
                    return new e1(new j1[0]);
                }
                return new e1((j1[]) e5.a.j(j1.f3375h, parcelableArrayList).toArray(new j1[0]));
            default:
                int i10 = bundle.getInt(u5.j.f36793d, -1);
                int[] intArray = bundle.getIntArray(u5.j.f36794e);
                int i11 = bundle.getInt(u5.j.f36795f, -1);
                if (i10 >= 0 && i11 >= 0) {
                    z10 = true;
                }
                yk.j.E0(z10);
                intArray.getClass();
                return new u5.j(i10, i11, intArray);
        }
    }

    @Override // a4.g
    public boolean d() {
        int i10 = SplashActivity.f10156m;
        return true;
    }

    @Override // nl.s
    public void f(boolean z10) {
        switch (this.f20975a) {
            case 17:
                FacebookSdk.m13sdkInitialize$lambda4(z10);
                return;
            case 18:
                FacebookSdk.m14sdkInitialize$lambda5(z10);
                return;
            case 19:
                FacebookSdk.m15sdkInitialize$lambda6(z10);
                return;
            case 20:
                FacebookSdk.m16sdkInitialize$lambda7(z10);
                return;
            case 21:
                FacebookSdk.m17sdkInitialize$lambda8(z10);
                return;
            case 22:
            default:
                if (z10 && !sl.a.b(fl.b.class)) {
                    try {
                        fl.b bVar = fl.b.f16165a;
                        if (!sl.a.b(bVar)) {
                            try {
                                nl.a0 a0Var = nl.a0.f28827a;
                                nl.y h10 = nl.a0.h(FacebookSdk.getApplicationId(), false);
                                if (h10 != null) {
                                    fl.b.f16167c = h10.f28979n;
                                }
                            } catch (Throwable th2) {
                                sl.a.a(bVar, th2);
                            }
                        }
                        if (fl.b.f16167c != null) {
                            fl.b.f16166b = true;
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        sl.a.a(fl.b.class, th3);
                        return;
                    }
                }
                return;
            case 23:
                if (z10 && !sl.a.b(zk.a.class)) {
                    try {
                        try {
                            FacebookSdk.getExecutor().execute(new com.appsflyer.internal.l(5));
                            return;
                        } catch (Throwable th4) {
                            sl.a.a(zk.a.class, th4);
                            return;
                        }
                    } catch (Exception e10) {
                        n0.E("zk.a", e10);
                        return;
                    }
                }
                return;
            case 24:
                if (z10) {
                    jl.b bVar2 = jl.b.f21462a;
                    if (!sl.a.b(jl.b.class)) {
                        try {
                            jl.b.f21463b = true;
                            jl.b.f21462a.b();
                            return;
                        } catch (Throwable th5) {
                            sl.a.a(jl.b.class, th5);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 25:
                if (z10) {
                    hl.e eVar = hl.e.f18611a;
                    if (!sl.a.b(hl.e.class)) {
                        try {
                            n0.Q(new com.appsflyer.internal.l(11));
                            return;
                        } catch (Throwable th6) {
                            sl.a.a(hl.e.class, th6);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 26:
                if (z10) {
                    dl.b bVar3 = dl.b.f14411a;
                    if (!sl.a.b(dl.b.class)) {
                        try {
                            dl.b.f14412b = true;
                            dl.b.f14411a.a();
                            return;
                        } catch (Throwable th7) {
                            sl.a.a(dl.b.class, th7);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 27:
                if (z10) {
                    el.j jVar = el.j.f15686a;
                    if (!sl.a.b(el.j.class)) {
                        try {
                            el.j.f15687b.set(true);
                            el.j.a();
                            return;
                        } catch (Throwable th8) {
                            sl.a.a(el.j.class, th8);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 28:
                if (z10) {
                    fl.d dVar = fl.d.f16170a;
                    if (!sl.a.b(fl.d.class)) {
                        try {
                            fl.d.f16171b = true;
                            fl.d.f16170a.a();
                            return;
                        } catch (Throwable th9) {
                            sl.a.a(fl.d.class, th9);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public Constructor g() {
        switch (this.f20975a) {
            case 4:
                int[] iArr = z5.n.f42110b;
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(z5.p.class).getConstructor(Integer.TYPE);
            default:
                int[] iArr2 = z5.n.f42110b;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(z5.p.class).getConstructor(new Class[0]);
        }
    }

    @Override // e5.j
    public void invoke(Object obj) {
        switch (this.f20975a) {
            case 0:
                ((c) obj).getClass();
                return;
            default:
                ((c) obj).getClass();
                return;
        }
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = jj.b.f21412a[it.getStatus().ordinal()];
    }

    public /* synthetic */ d(b bVar, int i10, long j10) {
        this.f20975a = 1;
    }

    public /* synthetic */ d(b bVar, long j10, int i10) {
        this.f20975a = 0;
    }
}
