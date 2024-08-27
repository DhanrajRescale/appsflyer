package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import pu.p;
import vt.v;

/* loaded from: classes.dex */
public final class AFi1ySDK extends AFi1xSDK {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Network;", "p0", "Landroid/net/NetworkInfo;", "values", "(Landroid/net/Network;)Landroid/net/NetworkInfo;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFi1ySDK$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends iu.k implements Function1<Network, NetworkInfo> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1ySDK.this.AFInAppEventParameterName;
            Intrinsics.c(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1ySDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean AFInAppEventParameterName(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    @NotNull
    public final String valueOf() {
        Network[] allNetworks;
        Sequence n10;
        Object obj;
        ConnectivityManager connectivityManager = this.AFInAppEventParameterName;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (n10 = v.n(allNetworks)) != null) {
            pu.e eVar = new pu.e(p.h(n10, new AnonymousClass3()));
            while (true) {
                if (eVar.hasNext()) {
                    obj = eVar.next();
                    if (AFi1xSDK.AFInAppEventParameterName((NetworkInfo) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NetworkInfo networkInfo = (NetworkInfo) obj;
            if (networkInfo != null) {
                int type = networkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return "unknown";
                    }
                    return "WIFI";
                }
                return "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean values() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.AFInAppEventParameterName;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.AFInAppEventParameterName;
                Intrinsics.c(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (AFInAppEventParameterName((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Failed collecting ivc data", e10);
            return false;
        }
    }
}
