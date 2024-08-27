package kp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l1;
import b0.o1;
import b0.s;
import b0.v;
import b0.y;
import bq.p;
import c0.m0;
import com.assetgro.stockgro.data.model.CreateGroupUser;
import com.assetgro.stockgro.data.model.GroupInfoInviteItem;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions;
import com.assetgro.stockgro.data.model.arenaV2.Option;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.facebook.FacebookSdk;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadi;
import com.google.android.gms.internal.p002firebaseauthapi.zzaea;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d2.s1;
import d2.w0;
import ek.u;
import g1.o;
import j2.g0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ls.s0;
import m0.b3;
import m0.b9;
import m0.l0;
import m0.o0;
import m0.x2;
import m0.z;
import n1.j0;
import n1.r0;
import okhttp3.HttpUrl;
import qu.f0;
import qu.i0;
import qu.k0;
import qu.n0;
import r0.a1;
import r0.n3;
import t0.d0;
import t0.g1;
import t0.l3;
import t0.m2;
import t0.o3;
import t0.r;
import t0.r1;
import t0.t;
import t0.x1;
import tb.x;
import v.c0;
import w.p0;
import w.t1;
import x1.h0;
import y.q0;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static int f23440a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile t9.d f23441b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile t9.c f23442c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f23443d;

    public static void A(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean B(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager != null && packageName != null) {
            if (packageManager.checkPermission("android.permission.INTERNET", packageName) != 0) {
                el.l.V0("MixpanelAPI.ConfigurationChecker", "Package does not have permission android.permission.INTERNET");
                el.l.l0("MixpanelAPI.ConfigurationChecker", "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
                return false;
            }
            try {
                ServiceInfo[] serviceInfoArr = packageManager.getPackageInfo(packageName, 4).services;
                if (serviceInfoArr != null && serviceInfoArr.length != 0) {
                    Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                    intent.setPackage(packageName);
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (it.hasNext()) {
                        try {
                            if (!s0.class.isAssignableFrom(Class.forName(it.next().serviceInfo.name))) {
                                it.remove();
                            }
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    if (queryIntentServices.size() == 0) {
                        return false;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            if (serviceInfo.name.equals(resolveInfo.serviceInfo.name) && serviceInfo.isEnabled()) {
                                arrayList.add(resolveInfo.serviceInfo);
                            }
                        }
                    }
                    if (arrayList.size() > 1) {
                        el.l.V0("MixpanelAPI.ConfigurationChecker", "You can't have more than one service handling \"com.google.firebase.MESSAGING_EVENT\" intent filter. Android will only use the first one that is declared on your AndroidManifest.xml. If you have more than one push provider you need to crate your own FirebaseMessagingService class.");
                    }
                    try {
                        String str = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
                    } catch (ClassNotFoundException unused2) {
                        el.l.V0("MixpanelAPI.ConfigurationChecker", "Google Play Services aren't included in your build- push notifications won't work on Lollipop/API 21 or greater");
                        el.l.l0("MixpanelAPI.ConfigurationChecker", "You can fix this by adding com.google.android.gms:play-services as a dependency of your gradle or maven project");
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused3) {
            }
        }
        return false;
    }

    public static boolean C(Context context) {
        if (f23443d == null) {
            Intent intent = new Intent(context, (Class<?>) ms.a.class);
            intent.addFlags(268435456);
            intent.addFlags(131072);
            if (context.getPackageManager().queryIntentActivities(intent, 0).size() == 0) {
                el.l.V0("MixpanelAPI.ConfigurationChecker", ms.a.class.getName().concat(" is not registered as an activity in your application, so takeover in-apps can't be shown."));
                el.l.l0("MixpanelAPI.ConfigurationChecker", "Please add the child tag <activity android:name=\"com.mixpanel.android.takeoverinapp.TakeoverInAppActivity\" /> to your <application> tag.");
                Boolean bool = Boolean.FALSE;
                f23443d = bool;
                return bool.booleanValue();
            }
            f23443d = Boolean.TRUE;
        }
        return f23443d.booleanValue();
    }

    public static int D(long j10) {
        boolean z10;
        int i10 = (int) j10;
        if (i10 == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        dp.b.R0(j10, z10, "Out of range: %s");
        return i10;
    }

    public static byte[] E(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static int F(int i10, int i11) {
        if (i11 <= 1073741823) {
            return Math.min(Math.max(i10, i11), 1073741823);
        }
        throw new IllegalArgumentException(pn.e.q("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i11), 1073741823));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (yk.g.o(r9, r1, r3, r2, r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap H(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, z8.g r7, z8.f r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.j.H(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, z8.g, z8.f, boolean):android.graphics.Bitmap");
    }

    public static Object I(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            if (i10 <= 65536) {
                return new short[i10];
            }
            return new int[i10];
        }
        throw new IllegalArgumentException(nn.d.h(52, "must be power of 2 between 2^1 and 2^30: ", i10));
    }

    public static void J(String str, Object... objArr) {
        Intrinsics.checkNotNullParameter("OptionChainFragment", "tag");
        com.google.android.gms.internal.p002firebaseauthapi.a.g(str, "s", objArr, "params", "OptionChainFragment").getClass();
        u.k(objArr);
    }

    public static final Object K(long j10, yt.a frame) {
        if (j10 <= 0) {
            return Unit.f23355a;
        }
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        if (j10 < Long.MAX_VALUE) {
            Q(iVar.f32216e).f(j10, iVar);
        }
        Object p10 = iVar.p();
        zt.a aVar = zt.a.f42823a;
        if (p10 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (p10 == aVar) {
            return p10;
        }
        return Unit.f23355a;
    }

    public static void L(ArrayList arrayList) {
        boolean z10;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                bq.a aVar = (bq.a) it.next();
                bq.h hVar = new bq.h(aVar);
                for (p pVar : aVar.f7239b) {
                    if (aVar.f7242e == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z11 = !z10;
                    bq.i iVar = new bq.i(pVar, z11);
                    if (!hashMap.containsKey(iVar)) {
                        hashMap.put(iVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(iVar);
                    if (!set.isEmpty() && !z11) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", pVar));
                    }
                    set.add(hVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (bq.h hVar2 : (Set) it2.next()) {
                        for (bq.j jVar : hVar2.f7255a.f7240c) {
                            if (jVar.f7262c == 0) {
                                Set<bq.h> set2 = (Set) hashMap.get(new bq.i(jVar.f7260a, jVar.a()));
                                if (set2 != null) {
                                    for (bq.h hVar3 : set2) {
                                        hVar2.f7256b.add(hVar3);
                                        hVar3.f7257c.add(hVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    bq.h hVar4 = (bq.h) it4.next();
                    if (hVar4.f7257c.isEmpty()) {
                        hashSet2.add(hVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    bq.h hVar5 = (bq.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar5);
                    i10++;
                    Iterator it5 = hVar5.f7256b.iterator();
                    while (it5.hasNext()) {
                        bq.h hVar6 = (bq.h) it5.next();
                        hVar6.f7257c.remove(hVar5);
                        if (hVar6.f7257c.isEmpty()) {
                            hashSet2.add(hVar6);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    bq.h hVar7 = (bq.h) it6.next();
                    if (!hVar7.f7257c.isEmpty() && !hVar7.f7256b.isEmpty()) {
                        arrayList2.add(hVar7.f7255a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
        }
    }

    public static void M() {
        int i10 = f23440a;
        if (i10 > 0) {
            f23440a = i10 - 1;
        }
    }

    public static final boolean N(int i10, int i11) {
        return i10 == i11;
    }

    public static boolean O(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final n0 Q(CoroutineContext coroutineContext) {
        n0 n0Var;
        CoroutineContext.Element g10 = coroutineContext.g(kotlin.coroutines.f.O);
        if (g10 instanceof n0) {
            n0Var = (n0) g10;
        } else {
            n0Var = null;
        }
        if (n0Var == null) {
            return k0.f32230a;
        }
        return n0Var;
    }

    public static final float R(int i10, t0.n nVar) {
        float f10;
        String o10;
        r rVar = (r) nVar;
        rVar.b0(1146399525);
        rVar.b0(2145892063);
        int i11 = (int) (i10 * 0.75d);
        if (1 <= i11 && i11 < 601) {
            o10 = jr.h.o("_", i11, "sdp");
        } else if (-60 <= i11 && i11 < 0) {
            o10 = jr.h.o("_minus", i11, "sdp");
        } else {
            f10 = i11;
            rVar.s(false);
            rVar.s(false);
            return f10;
        }
        rVar.b0(-1207471138);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        int identifier = context.getResources().getIdentifier(o10, "dimen", context.getPackageName());
        rVar.s(false);
        if (identifier != 0) {
            f10 = hl.f.S(identifier, rVar);
        } else {
            f10 = i11;
        }
        rVar.s(false);
        rVar.s(false);
        return f10;
    }

    public static final long S(int i10, t0.n nVar, int i11) {
        r rVar = (r) nVar;
        rVar.b0(1548374752);
        w2.b bVar = (w2.b) rVar.m(s1.f13620e);
        rVar.b0(377374779);
        long o10 = bVar.o(R(i10, rVar));
        rVar.s(false);
        rVar.s(false);
        return o10;
    }

    public static int T(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static final int U(long j10, long j11) {
        return (int) ((((float) (j11 - (System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT))) / ((float) (j11 - j10))) * 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        b0(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r13[r5] = T(r13[r5], r9, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int V(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = lp.g0.o(r9)
            r1 = r0 & r11
            int r2 = a0(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = pn.e.g(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = pn.e.g(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            b0(r1, r9, r12)
            goto L3b
        L33:
            r10 = r13[r5]
            int r9 = T(r10, r9, r11)
            r13[r5] = r9
        L3b:
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.j.V(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static int W(long j10) {
        if (j10 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static final void X(MaterialCardView materialCardView, MissionStatus status) {
        int i10;
        Intrinsics.checkNotNullParameter(materialCardView, "<this>");
        Intrinsics.checkNotNullParameter(status, "status");
        int i11 = ic.a.f19841a[status.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        i10 = R.color.green_light_new;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i10 = R.color.light_peach;
                }
            } else {
                i10 = R.color.blue_E0F8FF;
            }
        } else {
            i10 = R.color.grey_EBEBEB;
        }
        materialCardView.setStrokeColor(r3.k.getColor(materialCardView.getContext(), i10));
    }

    public static final void Y(ImageView imageView, String rewardType) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        if (Intrinsics.a(rewardType, "cash")) {
            imageView.setImageDrawable(r3.k.getDrawable(imageView.getContext(), R.drawable.ic_cash_new));
        } else {
            imageView.setImageDrawable(r3.k.getDrawable(imageView.getContext(), R.drawable.ic_bonus_new));
        }
    }

    public static final void Z(TextView textView, MissionStatus missionStatus) {
        int i10;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        int i11 = 8;
        if (missionStatus != null && (i10 = ic.a.f19841a[missionStatus.ordinal()]) != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i11 = 0;
            }
        }
        textView.setVisibility(i11);
    }

    public static final void a(boolean z10, o modifier, Function1 function1, t0.n nVar, int i10) {
        int i11;
        boolean z11;
        long j10;
        int i12;
        int i13;
        boolean z12;
        String str;
        g1.g gVar;
        int i14;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        r rVar = (r) nVar;
        rVar.c0(-2003639893);
        if ((i10 & 14) == 0) {
            if (rVar.i(z10)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.h(modifier)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 896) == 0) {
            if (rVar.j(function1)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i11 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            w2.b bVar = (w2.b) rVar.m(s1.f13620e);
            rVar.b0(-1560571896);
            if ((i11 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object Q = rVar.Q();
            Object obj = t0.m.f35080a;
            o3 o3Var = o3.f35116a;
            if (z11 || Q == obj) {
                Q = t.n0(Boolean.valueOf(z10), o3Var);
                rVar.k0(Q);
            }
            g1 g1Var = (g1) Q;
            Object h10 = v.e.h(rVar, false, -1560569384);
            if (h10 == obj) {
                h10 = t.n0(Boolean.TRUE, o3Var);
                rVar.k0(h10);
            }
            g1 g1Var2 = (g1) h10;
            rVar.s(false);
            rVar.b0(773894976);
            rVar.b0(-723523240);
            Object Q2 = rVar.Q();
            if (Q2 == obj) {
                Q2 = v.e.o(t.I(kotlin.coroutines.k.f23369a, rVar), rVar);
            }
            rVar.s(false);
            f0 f0Var = ((d0) Q2).f34970a;
            rVar.s(false);
            if (((Boolean) g1Var.getValue()).booleanValue()) {
                j10 = 4279272566L;
            } else {
                j10 = 4290641920L;
            }
            long d10 = androidx.compose.ui.graphics.a.d(j10);
            long j11 = n1.t.f28173e;
            float R = R(24, rVar);
            float R2 = R(10, rVar);
            if (((Boolean) g1Var.getValue()).booleanValue()) {
                i12 = -1560559750;
                i13 = 70;
            } else {
                i12 = -1560559366;
                i13 = 90;
            }
            float d11 = jr.h.d(rVar, i12, i13, rVar, false);
            rVar.b0(-1560557486);
            Object Q3 = rVar.Q();
            if (Q3 == obj) {
                Q3 = w.e.a(5.0f);
                rVar.k0(Q3);
            }
            w.d dVar = (w.d) Q3;
            rVar.s(false);
            t.e(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), new ac.b(bVar, f0Var, g1Var, d11, R2, dVar, g1Var2, null), rVar);
            o n10 = androidx.compose.foundation.layout.d.n(modifier, d11, R);
            Unit unit = Unit.f23355a;
            rVar.b0(-1560531100);
            boolean h11 = rVar.h(g1Var);
            if ((i11 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z13 = h11 | z12;
            Object Q4 = rVar.Q();
            if (z13 || Q4 == obj) {
                Q4 = new ac.c(g1Var, null, function1);
                rVar.k0(Q4);
            }
            rVar.s(false);
            o a10 = h0.a(n10, unit, (Function2) Q4);
            g1.g gVar2 = g1.a.f16383e;
            rVar.b0(733328855);
            v c10 = s.c(gVar2, false, rVar, 6);
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            Function0 function0 = c2.k.f7746b;
            b1.c j12 = androidx.compose.ui.layout.a.j(a10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(function0);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, c10, c2.k.f7749e);
                t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f1281a;
                g1.l lVar = g1.l.f16404b;
                androidx.compose.foundation.a.b(bVar2.b(), new ac.d(d10, j11, dVar, R2), rVar, 0);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    str = "LIVE";
                } else {
                    str = "EXPIRED";
                }
                o2.v vVar = jh.c.f21380i;
                long S = S(12, rVar, 6);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    gVar = g1.a.f16382d;
                } else {
                    gVar = g1.a.f16384f;
                }
                n3.a(str, androidx.compose.foundation.layout.a.x(bVar2.a(lVar, gVar), R(8, rVar), s0.g.f34069a, R(8, rVar), R(2, rVar), 2), j11, S, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1573248, 0, 130992);
                v.e.y(rVar, false, true, false, false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new l0.f(z10, modifier, function1, i10, 2);
        }
    }

    public static int a0(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i10] & 65535;
        }
        return ((int[]) obj)[i10];
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x08e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.assetgro.stockgro.data.model.UserChatGroup r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, int r70, int r71, kotlin.Pair r72, kotlin.jvm.functions.Function1 r73, kotlin.jvm.functions.Function2 r74, t0.n r75, int r76) {
        /*
            Method dump skipped, instructions count: 2299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.j.b(com.assetgro.stockgro.data.model.UserChatGroup, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.Pair, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, t0.n, int):void");
    }

    public static void b0(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static final void c(SocialChatListViewModel viewModel, m0 scrollState, int i10, Function1 onGroupClicked, Function2 onGroupLongPress, Function0 onMessageInvitesClicked, t0.n nVar, int i11) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(onGroupClicked, "onGroupClicked");
        Intrinsics.checkNotNullParameter(onGroupLongPress, "onGroupLongPress");
        Intrinsics.checkNotNullParameter(onMessageInvitesClicked, "onMessageInvitesClicked");
        r rVar = (r) nVar;
        rVar.c0(568501628);
        i0.c(androidx.compose.foundation.layout.d.f1286c, scrollState, null, false, null, null, null, false, new b3(viewModel, onMessageInvitesClicked, i10, onGroupClicked, onGroupLongPress, 1), rVar, (i11 & 112) | 6, 252);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new v.u(viewModel, scrollState, i10, onGroupClicked, onGroupLongPress, onMessageInvitesClicked, i11);
        }
    }

    public static int[] c0(Collection collection) {
        if (collection instanceof np.a) {
            np.a aVar = (np.a) collection;
            return Arrays.copyOfRange(aVar.f29070a, aVar.f29071b, aVar.f29072c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final void d(SocialChatListViewModel viewModel, m0 scrollState, Function1 onGroupClicked, Function2 onGroupLongPress, Function0 onSwipeRefreshTriggered, Function0 onMessageInvitesClicked, Function0 onRetryClick, t0.n nVar, int i10) {
        boolean z10;
        g1.l lVar;
        p0.o oVar;
        boolean z11;
        r rVar;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(onGroupClicked, "onGroupClicked");
        Intrinsics.checkNotNullParameter(onGroupLongPress, "onGroupLongPress");
        Intrinsics.checkNotNullParameter(onSwipeRefreshTriggered, "onSwipeRefreshTriggered");
        Intrinsics.checkNotNullParameter(onMessageInvitesClicked, "onMessageInvitesClicked");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        r rVar2 = (r) nVar;
        rVar2.c0(-1689697026);
        g1 K0 = yk.j.K0(viewModel.M, rVar2);
        g1 K02 = yk.j.K0(new tu.s0(viewModel.R), rVar2);
        boolean booleanValue = ((Boolean) K02.getValue()).booleanValue();
        rVar2.b0(-1151408914);
        int i11 = 1;
        if ((((i10 & 57344) ^ 24576) > 16384 && rVar2.h(onSwipeRefreshTriggered)) || (i10 & 24576) == 16384) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar2.Q();
        to.e eVar = t0.m.f35080a;
        if (z10 || Q == eVar) {
            Q = v.e.p(onSwipeRefreshTriggered, 19, rVar2);
        }
        rVar2.s(false);
        p0.o D1 = dp.b.D1(booleanValue, (Function0) Q, rVar2, 0);
        rVar2.b0(-1151406487);
        r(scrollState, new id.v(viewModel, i11), rVar2, 0);
        rVar2.s(false);
        id.o oVar2 = (id.o) K0.getValue();
        rVar2.b0(-1151403027);
        boolean h10 = rVar2.h(oVar2);
        Object Q2 = rVar2.Q();
        if (h10 || Q2 == eVar) {
            Q2 = Integer.valueOf(((id.o) K0.getValue()).f19869b);
            rVar2.k0(Q2);
        }
        int intValue = ((Number) Q2).intValue();
        rVar2.s(false);
        g1.l lVar2 = g1.l.f16404b;
        o a10 = h2.l.a(al.d.K0(androidx.compose.animation.a.a(androidx.compose.foundation.layout.d.f1286c), D1), false, kd.d.f23074b);
        rVar2.b0(733328855);
        v c10 = s.c(g1.a.f16379a, false, rVar2, 0);
        rVar2.b0(-1323940314);
        int i12 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(a10);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t.v0(rVar2, c10, c2.k.f7749e);
            t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar2, i12, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
            if (((id.o) K0.getValue()).f19873f) {
                rVar2.b0(837239870);
                yk.j.f(rVar2, 0);
                rVar2.s(false);
                rVar = rVar2;
                lVar = lVar2;
                oVar = D1;
                z11 = false;
            } else if (((id.o) K0.getValue()).f19874g) {
                rVar2.b0(837327104);
                yk.o.p(null, onRetryClick, rVar2, (i10 >> 15) & 112, 1);
                rVar2.s(false);
                z11 = false;
                rVar = rVar2;
                lVar = lVar2;
                oVar = D1;
            } else {
                rVar2.b0(837417717);
                int i13 = i10 << 3;
                lVar = lVar2;
                oVar = D1;
                z11 = false;
                rVar = rVar2;
                c(viewModel, scrollState, intValue, onGroupClicked, onGroupLongPress, onMessageInvitesClicked, rVar2, (i10 & 112) | 8 | (i13 & 7168) | (i13 & 57344) | (458752 & i10));
                rVar.s(false);
            }
            p0.h.a(((Boolean) K02.getValue()).booleanValue(), oVar, bVar.a(lVar, g1.a.f16380b), 0L, 0L, false, rVar, 64, 56);
            x1 t10 = da.e.t(rVar, z11, true, z11, z11);
            if (t10 != null) {
                t10.f35245d = new kd.e(viewModel, scrollState, onGroupClicked, onGroupLongPress, onSwipeRefreshTriggered, onMessageInvitesClicked, onRetryClick, i10);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static byte[] d0(com.google.firebase.messaging.d dVar) {
        int i10;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(UserMetadata.MAX_INTERNAL_KEY_SIZE, Math.max(128, Integer.highestOneBit(0) * 2));
        int i11 = 0;
        while (i11 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i11);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < min2) {
                int read = dVar.read(bArr, i12, min2 - i12);
                if (read == -1) {
                    return E(arrayDeque, i11);
                }
                i12 += read;
                i11 += read;
            }
            long j10 = min;
            if (min < 4096) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            long j11 = j10 * i10;
            if (j11 > 2147483647L) {
                min = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            } else if (j11 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j11;
            }
        }
        if (dVar.read() == -1) {
            return E(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final void e(String text, q1.b icon, Function0 onClick, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        r rVar = (r) nVar;
        rVar.c0(1069506727);
        g1.l lVar = g1.l.f16404b;
        o k10 = androidx.compose.foundation.a.k(lVar, onClick, 7);
        g1.e eVar = g1.a.f16392n;
        b0.g gVar = b0.n.f2939e;
        rVar.b0(-483455358);
        l1 a10 = y.a(gVar, eVar, rVar, 54);
        rVar.b0(-1323940314);
        int i11 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(k10);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t.v0(rVar, a10, c2.k.f7749e);
            t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            float f10 = 36;
            androidx.compose.foundation.a.c(icon, text, androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, f10), f10), null, null, s0.g.f34069a, null, rVar, ((i10 << 3) & 112) | 392, 120);
            al.d.C(text, androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, 12, s0.g.f34069a, s0.g.f34069a, 13), w0.e(R.color.black_1A1A1A, rVar), yk.j.e1(12), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, (i10 & 14) | 1575984, 0, 130992);
            x1 t10 = da.e.t(rVar, false, true, false, false);
            if (t10 != null) {
                t10.f35245d = new d0.n0(text, icon, onClick, i10, 12);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static String e0(int i10) {
        if (N(i10, 1)) {
            return "Clip";
        }
        if (N(i10, 2)) {
            return "Ellipsis";
        }
        if (N(i10, 3)) {
            return "Visible";
        }
        return "Invalid";
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [f.a, java.lang.Object] */
    public static final void f(Function1 uploadData, t0.n nVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        Intrinsics.checkNotNullParameter(uploadData, "uploadData");
        r rVar = (r) nVar;
        rVar.c0(237923491);
        if ((i10 & 14) == 0) {
            if (rVar.j(uploadData)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        int i13 = 1;
        if ((i11 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            ?? obj = new Object();
            rVar.b0(-300009310);
            int i14 = i11 & 14;
            int i15 = 0;
            if (i14 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (z10 || Q == eVar) {
                Q = new c0(19, uploadData);
                rVar.k0(Q);
            }
            rVar.s(false);
            c.n G = i0.G(obj, (Function1) Q, rVar, 8);
            f.b bVar = new f.b(i15);
            rVar.b0(-300001536);
            if (i14 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object Q2 = rVar.Q();
            if (z11 || Q2 == eVar) {
                Q2 = new c0(18, uploadData);
                rVar.k0(Q2);
            }
            rVar.s(false);
            pp.b.b(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), h0.h.a(10, 10), 0L, null, s0.g.f34069a, b1.d.c(318906950, new q0(24, G, i0.G(bVar, (Function1) Q2, rVar, 8)), rVar), rVar, 1572870, 60);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new yb.t(i10, i13, uploadData);
        }
    }

    public static final void f0(ImageView imageView, boolean z10) {
        int i10;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (z10) {
            i10 = R.drawable.ic_how_to_play_down;
        } else if (!z10) {
            i10 = R.drawable.ic_how_to_play_up;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        imageView.setImageDrawable(r3.k.getDrawable(imageView.getContext(), i10));
    }

    public static final void g(boolean z10, Function0 onBackPressed, t0.n nVar, int i10, int i11) {
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        r rVar = (r) nVar;
        rVar.c0(-1731633496);
        int i15 = i11 & 1;
        int i16 = 2;
        if (i15 != 0) {
            i12 = i10 | 6;
            z11 = z10;
        } else if ((i10 & 14) == 0) {
            z11 = z10;
            if (rVar.i(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            z11 = z10;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.j(onBackPressed)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && rVar.G()) {
            rVar.V();
            z12 = z11;
        } else {
            if (i15 != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            l0.b(androidx.compose.foundation.layout.d.t(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.a.d(g1.l.f16404b, kq.e.R(vt.y.g(new n1.t(w0.e(R.color.gradientColor1, rVar)), new n1.t(w0.e(R.color.gradientColor2, rVar))), s0.g.f34069a, 14), null, 6), 1.0f)), n1.t.f28176h, 0L, 0, null, b1.d.c(1231965593, new l0.h(i16, onBackPressed, z12), rVar), rVar, 199728, 20);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new c.h(z12, onBackPressed, i10, i11, 2);
        }
    }

    public static zzaec g0(zp.d dVar, String str) {
        Preconditions.checkNotNull(dVar);
        if (zp.j.class.isAssignableFrom(dVar.getClass())) {
            zp.j jVar = (zp.j) dVar;
            Preconditions.checkNotNull(jVar);
            return new zzaec(jVar.f42764a, jVar.f42765b, "google.com", null, null, null, str, null, null);
        }
        if (zp.g.class.isAssignableFrom(dVar.getClass())) {
            zp.g gVar = (zp.g) dVar;
            Preconditions.checkNotNull(gVar);
            return new zzaec(null, gVar.f42748a, FacebookSdk.FACEBOOK_COM, null, null, null, str, null, null);
        }
        if (zp.v.class.isAssignableFrom(dVar.getClass())) {
            zp.v vVar = (zp.v) dVar;
            Preconditions.checkNotNull(vVar);
            return new zzaec(null, vVar.f42784a, "twitter.com", null, vVar.f42785b, null, str, null, null);
        }
        if (zp.i.class.isAssignableFrom(dVar.getClass())) {
            zp.i iVar = (zp.i) dVar;
            Preconditions.checkNotNull(iVar);
            return new zzaec(null, iVar.f42759a, "github.com", null, null, null, str, null, null);
        }
        if (zp.u.class.isAssignableFrom(dVar.getClass())) {
            zp.u uVar = (zp.u) dVar;
            Preconditions.checkNotNull(uVar);
            return new zzaec(null, null, "playgames.google.com", null, null, uVar.f42783a, str, null, null);
        }
        if (zp.d0.class.isAssignableFrom(dVar.getClass())) {
            zp.d0 d0Var = (zp.d0) dVar;
            Preconditions.checkNotNull(d0Var);
            zzaec zzaecVar = d0Var.f42733d;
            if (zzaecVar == null) {
                return new zzaec(d0Var.f42731b, d0Var.f42732c, d0Var.f42730a, null, d0Var.f42735f, null, str, d0Var.f42734e, d0Var.f42736g);
            }
            return zzaecVar;
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }

    public static final void h(t0.n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(-573853303);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            o e10 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.a.w(androidx.compose.foundation.layout.d.e(lVar, 1.0f), R(16, rVar), R(12, rVar), R(16, rVar), R(10, rVar)), n1.t.f28173e, n1.s0.f28162a);
            b0.g gVar = b0.n.f2941g;
            rVar.b0(693286680);
            l1 a10 = o1.a(gVar, g1.a.f16388j, rVar, 6);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t.v0(rVar, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                g1.f fVar = g1.a.f16389k;
                rVar.b0(693286680);
                l1 a11 = o1.a(b0.n.f2935a, fVar, rVar, 48);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, a11, iVar);
                    t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar, i12, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    h0.g gVar2 = h0.h.f17801a;
                    s.a(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(lVar, gVar2), yk.j.g0(rVar), null, 6), R(21, rVar)), rVar, 0);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, R(20, rVar)), rVar);
                    s.a(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(lVar, gVar2), yk.j.g0(rVar), null, 6), R(21, rVar)), rVar, 0);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, R(20, rVar)), rVar);
                    s.a(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(lVar, gVar2), yk.j.g0(rVar), null, 6), R(21, rVar)), rVar, 0);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, R(20, rVar)), rVar);
                    s.a(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(lVar, gVar2), yk.j.g0(rVar), null, 6), R(21, rVar)), rVar, 0);
                    v.e.y(rVar, false, true, false, false);
                    s.a(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(lVar, gVar2), yk.j.g0(rVar), null, 6), R(21, rVar)), rVar, 0);
                    v.e.y(rVar, false, true, false, false);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 5);
        }
    }

    public static zp.l h0(zzadi zzadiVar) {
        if (zzadiVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzadiVar.zzf())) {
            return new zp.t(zzadiVar.zza(), zzadiVar.zze(), zzadiVar.zzd(), Preconditions.checkNotEmpty(zzadiVar.zzf()));
        }
        if (zzadiVar.zzc() == null) {
            return null;
        }
        return new zp.c0(zzadiVar.zze(), zzadiVar.zzd(), zzadiVar.zza(), (zzaea) Preconditions.checkNotNull(zzadiVar.zzc(), "totpInfo cannot not be null."));
    }

    public static final void i(xb.g type, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(type, "type");
        r rVar = (r) nVar;
        rVar.c0(46547879);
        if ((i10 & 14) == 0) {
            if (rVar.h(type)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar.G()) {
            rVar.V();
            i13 = 0;
        } else {
            g1.l lVar = g1.l.f16404b;
            long j10 = n1.t.f28173e;
            r0 r0Var = n1.s0.f28162a;
            o e10 = androidx.compose.foundation.a.e(lVar, j10, r0Var);
            rVar.b0(733328855);
            v c10 = s.c(g1.a.f16379a, false, rVar, 0);
            rVar.b0(-1323940314);
            int i15 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j11 = androidx.compose.ui.layout.a.j(e10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t.v0(rVar, c10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar, i15, iVar3);
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                o e11 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.d.e(lVar, 1.0f), R(16, rVar), s0.g.f34069a, 2), j10, r0Var);
                b0.g gVar = b0.n.f2939e;
                rVar.b0(-483455358);
                l1 a10 = y.a(gVar, g1.a.f16391m, rVar, 6);
                rVar.b0(-1323940314);
                int i16 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j12 = androidx.compose.ui.layout.a.j(e11);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, a10, iVar);
                    t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                        nn.d.s(i16, rVar, i16, iVar3);
                    }
                    nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                    s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, R(13, rVar)), R(264, rVar))), yk.j.g0(rVar), null, 6), rVar, 0);
                    v.e.s(5, rVar, lVar, rVar);
                    s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, R(13, rVar)), R(190, rVar))), yk.j.g0(rVar), null, 6), rVar, 0);
                    v.e.s(5, rVar, lVar, rVar);
                    s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, R(11, rVar)), R(328, rVar))), yk.j.g0(rVar), null, 6), rVar, 0);
                    v.e.s(5, rVar, lVar, rVar);
                    s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, R(13, rVar)), R(98, rVar))), yk.j.g0(rVar), null, 6), rVar, 0);
                    v.e.s(5, rVar, lVar, rVar);
                    s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, R(13, rVar)), R(264, rVar))), yk.j.g0(rVar), null, 6), rVar, 0);
                    v.e.s(18, rVar, lVar, rVar);
                    o g10 = androidx.compose.foundation.a.h((float) 0.5d, androidx.compose.foundation.a.d(da.e.k(10, rVar, androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, R(295, rVar)), 1.0f)), yk.j.g0(rVar), null, 6), kq.e.K(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4292796126L)), new n1.t(androidx.compose.ui.graphics.a.d(4290361785L))), t.g(s0.g.f34069a, s0.g.f34069a), t.g(kj.f.i(64), s0.g.f34069a)), h0.h.b(R(10, rVar))).g(new HorizontalAlignElement(g1.a.f16392n));
                    g1.g gVar2 = g1.a.f16383e;
                    rVar.b0(733328855);
                    v c11 = s.c(gVar2, false, rVar, 6);
                    rVar.b0(-1323940314);
                    int i17 = rVar.P;
                    r1 o12 = rVar.o();
                    b1.c j13 = androidx.compose.ui.layout.a.j(g10);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t.v0(rVar, c11, iVar);
                        t.v0(rVar, o12, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                            nn.d.s(i17, rVar, i17, iVar3);
                        }
                        nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                        int ordinal = type.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    i12 = R.drawable.ic_placeholder_shimmer_video;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i12 = R.drawable.ic_placeholder_shimmer_document;
                            }
                        } else {
                            i12 = R.drawable.ic_placeholder_shimmer_image;
                        }
                        a1.a(w0.u(i12, rVar, 0), "Image", androidx.compose.foundation.layout.d.m(lVar, R(96, rVar)), androidx.compose.ui.graphics.a.d(4291611852L), rVar, 3128, 0);
                        i13 = 0;
                        v.e.y(rVar, false, true, false, false);
                        v.e.y(rVar, false, true, false, false);
                        v.e.y(rVar, false, true, false, false);
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new xb.d(type, i10, i13);
        }
    }

    public static ArrayList i0(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zp.l h02 = h0((zzadi) it.next());
                if (h02 != null) {
                    arrayList.add(h02);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static final void j(int i10, t0.n nVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        r rVar = (r) nVar;
        rVar.c0(288052868);
        int i17 = i12 & 1;
        int i18 = 4;
        if (i17 != 0) {
            i14 = i11 | 6;
            i13 = i10;
        } else if ((i11 & 14) == 0) {
            i13 = i10;
            if (rVar.f(i13)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i15 | i11;
        } else {
            i13 = i10;
            i14 = i11;
        }
        if ((i14 & 11) == 2 && rVar.G()) {
            rVar.V();
            i16 = i13;
        } else {
            if (i17 != 0) {
                i16 = 5;
            } else {
                i16 = i13;
            }
            o a10 = h2.l.a(androidx.compose.foundation.layout.d.f1286c, false, xb.e.f40161c);
            rVar.b0(1328701260);
            if ((i14 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q = rVar.Q();
            if (z10 || Q == t0.m.f35080a) {
                Q = new l1.i(i16, i18);
                rVar.k0(Q);
            }
            rVar.s(false);
            i0.c(a10, null, null, false, null, null, null, false, (Function1) Q, rVar, 0, 254);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new xb.f(i16, i11, i12);
        }
    }

    public static final void k(boolean z10, boolean z11, List stockGraphEntries, o modifier, t0.n nVar, int i10) {
        Object next;
        double d10;
        double d11;
        Intrinsics.checkNotNullParameter(stockGraphEntries, "stockGraphEntries");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        r rVar = (r) nVar;
        rVar.c0(115791532);
        if (z10) {
            Object obj = null;
            if (!stockGraphEntries.isEmpty()) {
                rVar.b0(1794448380);
                Iterator it = stockGraphEntries.iterator();
                if (!it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        double d12 = ((hb.f) next).f18169a;
                        do {
                            Object next2 = it.next();
                            double d13 = ((hb.f) next2).f18169a;
                            if (Double.compare(d12, d13) > 0) {
                                next = next2;
                                d12 = d13;
                            }
                        } while (it.hasNext());
                    }
                }
                hb.f fVar = (hb.f) next;
                if (fVar != null) {
                    d10 = fVar.f18169a;
                } else {
                    d10 = 0.0d;
                }
                Iterator it2 = stockGraphEntries.iterator();
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (it2.hasNext()) {
                        double d14 = ((hb.f) obj).f18169a;
                        do {
                            Object next3 = it2.next();
                            double d15 = ((hb.f) next3).f18169a;
                            if (Double.compare(d14, d15) < 0) {
                                obj = next3;
                                d14 = d15;
                            }
                        } while (it2.hasNext());
                    }
                }
                hb.f fVar2 = (hb.f) obj;
                if (fVar2 != null) {
                    d11 = fVar2.f18169a;
                } else {
                    d11 = 0.0d;
                }
                androidx.compose.foundation.a.b(h2.l.a(androidx.compose.foundation.layout.d.e(modifier, (stockGraphEntries.size() / 72.0f) * 1.0f), false, zb.a.f42237t), new zb.g(z11, stockGraphEntries, d10, d11), rVar, 0);
                rVar.s(false);
            } else {
                rVar.b0(1797662150);
                o a10 = h2.l.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(modifier, 1.0f), new j0(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.c(1725421527)), new n1.t(androidx.compose.ui.graphics.a.c(14869218))), t.g(s0.g.f34069a, s0.g.f34069a), t.g(s0.g.f34069a, Float.POSITIVE_INFINITY), 0), null, 6), false, zb.a.f42238u);
                g1.g gVar = g1.a.f16381c;
                rVar.b0(733328855);
                v c10 = s.c(gVar, false, rVar, 6);
                rVar.b0(-1323940314);
                int i11 = rVar.P;
                r1 o10 = rVar.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(a10);
                if (rVar.f35166a instanceof t0.f) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, c10, c2.k.f7749e);
                    t.v0(rVar, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar, i11, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                    b9.b("Trouble loading chart", androidx.compose.foundation.layout.a.x(g1.l.f16404b, s0.g.f34069a, R(4, rVar), R(8, rVar), s0.g.f34069a, 9), 0L, 0L, null, null, null, 0L, null, new u2.i(6), 0L, 0, false, 0, 0, null, new g0(androidx.compose.ui.graphics.a.d(4289045925L), S(10, rVar, 6), null, jh.c.f21377f, 0, S(20, rVar, 6), null, 16646108), rVar, 6, 0, 65020);
                    v.e.y(rVar, false, true, false, false);
                    rVar.s(false);
                } else {
                    al.d.v0();
                    throw null;
                }
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new zb.h(z10, z11, stockGraphEntries, modifier, i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x010d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r0.Q(), java.lang.Integer.valueOf(r11)) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(com.assetgro.stockgro.data.model.CreateGroupUser r42, boolean r43, boolean r44, kotlin.jvm.functions.Function2 r45, t0.n r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.j.l(com.assetgro.stockgro.data.model.CreateGroupUser, boolean, boolean, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void m(GroupInfoInviteItem groupInviteItem, t0.n nVar, int i10) {
        int i11;
        c2.j jVar;
        c2.i iVar;
        r rVar;
        int i12;
        Intrinsics.checkNotNullParameter(groupInviteItem, "groupInviteItem");
        r rVar2 = (r) nVar;
        rVar2.c0(962158524);
        if ((i10 & 14) == 0) {
            if (rVar2.h(groupInviteItem)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            Context context = (Context) rVar2.m(AndroidCompositionLocals_androidKt.f1428b);
            rVar2.b0(-483455358);
            g1.l lVar = g1.l.f16404b;
            b0.f fVar = b0.n.f2937c;
            g1.e eVar = g1.a.f16391m;
            l1 a10 = y.a(fVar, eVar, rVar2, 0);
            rVar2.b0(-1323940314);
            int i13 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar2 = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
            boolean z10 = rVar2.f35166a instanceof t0.f;
            if (z10) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar2);
                } else {
                    rVar2.n0();
                }
                c2.i iVar2 = c2.k.f7749e;
                t.v0(rVar2, a10, iVar2);
                c2.i iVar3 = c2.k.f7748d;
                t.v0(rVar2, o10, iVar3);
                c2.i iVar4 = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                    nn.d.s(i13, rVar2, i13, iVar4);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                float f10 = 8;
                o x10 = androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, f10, s0.g.f34069a, f10, 5);
                g1.f fVar2 = g1.a.f16389k;
                rVar2.b0(693286680);
                l1 a11 = o1.a(b0.n.f2935a, fVar2, rVar2, 48);
                rVar2.b0(-1323940314);
                int i14 = rVar2.P;
                r1 o11 = rVar2.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(x10);
                if (z10) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar2);
                    } else {
                        rVar2.n0();
                    }
                    t.v0(rVar2, a11, iVar2);
                    t.v0(rVar2, o11, iVar3);
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                        nn.d.s(i14, rVar2, i14, iVar4);
                    }
                    nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
                    float f11 = 40;
                    float f12 = 4;
                    pp.b.b(androidx.compose.foundation.a.k(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, f11), f11), h0.h.f17801a), new ad.f(context, groupInviteItem), 7), null, 0L, null, f12, b1.d.c(-1891242209, new androidx.compose.foundation.layout.e(groupInviteItem, 28), rVar2), rVar2, 1769472, 30);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar2);
                    rVar2.b0(-483455358);
                    l1 a12 = y.a(fVar, eVar, rVar2, 0);
                    rVar2.b0(-1323940314);
                    int i15 = rVar2.P;
                    r1 o12 = rVar2.o();
                    b1.c j12 = androidx.compose.ui.layout.a.j(lVar);
                    if (z10) {
                        rVar2.e0();
                        if (rVar2.O) {
                            jVar = jVar2;
                            rVar2.n(jVar);
                        } else {
                            jVar = jVar2;
                            rVar2.n0();
                        }
                        t.v0(rVar2, a12, iVar2);
                        t.v0(rVar2, o12, iVar3);
                        if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i15))) {
                            iVar = iVar4;
                            nn.d.s(i15, rVar2, i15, iVar);
                        } else {
                            iVar = iVar4;
                        }
                        nn.d.q(0, j12, new m2(rVar2), rVar2, 2058660585);
                        String displayName = groupInviteItem.getDisplayName();
                        long e10 = w0.e(R.color.black_1A1A1A, rVar2);
                        long e12 = yk.j.e1(14);
                        o2.v vVar = jh.c.f21372a;
                        c2.j jVar3 = jVar;
                        b9.b(displayName, null, e10, e12, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f12), rVar2);
                        b9.b(a3.a.f("@", groupInviteItem.getUsername()), null, w0.e(R.color.greyTextGroup, rVar2), yk.j.e1(10), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                        v.e.y(rVar2, false, true, false, false);
                        v.e.y(rVar2, false, true, false, false);
                        o f13 = v.e.f(lVar, 6, rVar2, lVar, 1.0f);
                        b0.d dVar = b0.n.f2936b;
                        rVar2.b0(693286680);
                        l1 a13 = o1.a(dVar, g1.a.f16388j, rVar2, 6);
                        rVar2.b0(-1323940314);
                        int i16 = rVar2.P;
                        r1 o13 = rVar2.o();
                        b1.c j13 = androidx.compose.ui.layout.a.j(f13);
                        if (z10) {
                            rVar2.e0();
                            if (rVar2.O) {
                                rVar2.n(jVar3);
                            } else {
                                rVar2.n0();
                            }
                            t.v0(rVar2, a13, iVar2);
                            t.v0(rVar2, o13, iVar3);
                            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i16))) {
                                nn.d.s(i16, rVar2, i16, iVar);
                            }
                            nn.d.q(0, j13, new m2(rVar2), rVar2, 2058660585);
                            hv.e l10 = hv.e.l(0, groupInviteItem.getUpdatedAtMicros() / 1000000);
                            hv.f fVar3 = a3.a.a(l10, l10).f18769a.f18726a;
                            jv.a b10 = jv.a.b("dd-MMM-yyyy");
                            fVar3.getClass();
                            String a14 = b10.a(fVar3);
                            Intrinsics.checkNotNullExpressionValue(a14, "format(...)");
                            rVar = rVar2;
                            b9.b(hl.f.d1(R.string.user_invited_group_info, new Object[]{a14}, rVar2), null, w0.e(R.color.greyOpacity80CC, rVar2), yk.j.e1(10), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                            v.e.y(rVar, false, true, false, false);
                            v.e.u(lVar, f10, rVar, false, true);
                            rVar.s(false);
                            rVar.s(false);
                            pp.b.c(null, 0L, s0.g.f34069a, s0.g.f34069a, rVar, 0, 15);
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p0(i10, 14, groupInviteItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0fe3  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0277  */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(java.lang.String r64, java.lang.String r65, java.lang.String r66, boolean r67, java.lang.String r68, hb.b r69, java.lang.String r70, java.lang.String r71, hb.b0 r72, g1.o r73, t0.n r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 4071
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.j.n(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, hb.b, java.lang.String, java.lang.String, hb.b0, g1.o, t0.n, int, int):void");
    }

    public static final void o(o oVar, h7.b lazyPagingItemsMessageInvites, hu.c onInvitedGroupClicked, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        o oVar2;
        o oVar3;
        Intrinsics.checkNotNullParameter(lazyPagingItemsMessageInvites, "lazyPagingItemsMessageInvites");
        Intrinsics.checkNotNullParameter(onInvitedGroupClicked, "onInvitedGroupClicked");
        r rVar = (r) nVar;
        rVar.c0(-1859856835);
        if ((i11 & 2) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(lazyPagingItemsMessageInvites)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onInvitedGroupClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i12 & 721) == 144 && rVar.G()) {
            rVar.V();
            oVar3 = oVar;
        } else {
            int i15 = i11 & 1;
            g1.l lVar = g1.l.f16404b;
            if (i15 != 0) {
                oVar2 = lVar;
            } else {
                oVar2 = oVar;
            }
            m0 a10 = c0.p0.a(rVar);
            if (lazyPagingItemsMessageInvites.b() > 0) {
                float f10 = 16;
                i0.c(androidx.compose.animation.a.a(androidx.compose.foundation.layout.a.x(lVar, f10, f10, f10, s0.g.f34069a, 8).g(androidx.compose.foundation.layout.d.f1286c)), a10, null, false, null, null, null, false, new zd.g(3, lazyPagingItemsMessageInvites, onInvitedGroupClicked), rVar, 0, 252);
            }
            oVar3 = oVar2;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 13, oVar3, lazyPagingItemsMessageInvites, onInvitedGroupClicked);
        }
    }

    public static final void p(Media media, Function2 function2, t0.n nVar, int i10) {
        int i11;
        boolean z10;
        Intrinsics.checkNotNullParameter(media, "media");
        r rVar = (r) nVar;
        rVar.c0(1109971341);
        rVar.b0(-1919287855);
        Object Q = rVar.Q();
        if (Q == t0.m.f35080a) {
            Q = t.n0(null, o3.f35116a);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        rVar.s(false);
        t.e(media, new ld.i(media, g1Var, null), rVar);
        g1.l lVar = g1.l.f16404b;
        o v10 = androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.d.e(lVar, 1.0f), s0.g.f34069a, 8, 1);
        rVar.b0(-483455358);
        l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i12 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(v10);
        boolean z11 = rVar.f35166a instanceof t0.f;
        if (z11) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t.v0(rVar, a10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t.v0(rVar, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar, i12, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            ld.k kVar = (ld.k) g1Var.getValue();
            if (kVar == null) {
                i11 = -1;
            } else {
                i11 = ld.j.f24564a[kVar.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    rVar.b0(1875558247);
                    rVar.s(false);
                } else {
                    rVar.b0(-1987511176);
                    String url = media.getUrl();
                    if (url != null) {
                        y(url, HttpUrl.FRAGMENT_ENCODE_SET, function2, rVar, ((i10 << 3) & 896) | 48);
                    }
                    rVar.s(false);
                }
                z10 = true;
            } else {
                rVar.b0(-1987830755);
                rVar.b0(733328855);
                v c10 = s.c(g1.a.f16379a, false, rVar, 0);
                rVar.b0(-1323940314);
                int i13 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                if (z11) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, c10, iVar);
                    t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar, i13, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    q6.l.d(media.getUrl(), null, androidx.compose.foundation.layout.d.f1286c, null, rVar, 432, 4088);
                    z10 = true;
                    v.e.y(rVar, false, true, false, false);
                    rVar.s(false);
                } else {
                    al.d.v0();
                    throw null;
                }
            }
            x1 t10 = da.e.t(rVar, false, z10, false, false);
            if (t10 != null) {
                t10.f35245d = new t1(media, function2, i10, 14);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final void q(SocialChatListViewModel viewModel, Function0 onMessageInvitesClicked, t0.n nVar, int i10) {
        int i11;
        r rVar;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onMessageInvitesClicked, "onMessageInvitesClicked");
        r rVar2 = (r) nVar;
        rVar2.c0(873663618);
        Integer num = (Integer) t.o0(viewModel.E, rVar2).getValue();
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        g1.l lVar = g1.l.f16404b;
        float f10 = 16;
        o a10 = h2.l.a(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.w(lVar, f10, f10, f10, f10), 1.0f), false, kd.d.f23075c);
        rVar2.b0(693286680);
        l1 a11 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar2, 0);
        rVar2.b0(-1323940314);
        int i12 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(a10);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t.v0(rVar2, a11, c2.k.f7749e);
            t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar2, i12, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            String c12 = hl.f.c1(R.string.conversations, rVar2);
            long e10 = w0.e(R.color.black_1A1A1A, rVar2);
            o2.v vVar = jh.c.f21375d;
            al.d.C(c12, null, e10, 0L, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1572864, 0, 131002);
            if (1.0f > 0.0d) {
                androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar2);
                if (i11 > 0) {
                    rVar2.b0(-237942388);
                    String d12 = hl.f.d1(R.string.invites_number, new Object[]{Integer.valueOf(i11)}, rVar2);
                    long e11 = w0.e(R.color.orangeText100Opacity, rVar2);
                    rVar2.b0(-1116045531);
                    if ((((i10 & 112) ^ 48) > 32 && rVar2.h(onMessageInvitesClicked)) || (i10 & 48) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object Q = rVar2.Q();
                    if (z11 || Q == t0.m.f35080a) {
                        Q = v.e.p(onMessageInvitesClicked, 20, rVar2);
                    }
                    rVar2.s(false);
                    al.d.C(d12, androidx.compose.foundation.a.k(lVar, (Function0) Q, 7), e11, 0L, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1572864, 0, 131000);
                    rVar2.s(false);
                    z10 = false;
                    rVar = rVar2;
                } else {
                    rVar2.b0(-237559476);
                    al.d.C(hl.f.c1(R.string.league_invites, rVar2), null, w0.e(R.color.orangeText45Opacity73, rVar2), 0L, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1572864, 0, 131002);
                    rVar = rVar2;
                    z10 = false;
                    rVar.s(false);
                }
                x1 t10 = da.e.t(rVar, z10, true, z10, z10);
                if (t10 != null) {
                    t10.f35245d = new t1(viewModel, onMessageInvitesClicked, i10, 13);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
        }
        al.d.v0();
        throw null;
    }

    public static final void r(m0 m0Var, Function0 loadMore, t0.n nVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        Intrinsics.checkNotNullParameter(loadMore, "loadMore");
        r rVar = (r) nVar;
        rVar.c0(-81783299);
        if ((i10 & 14) == 0) {
            if (rVar.h(m0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.j(loadMore)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = 1;
        if ((i11 & 91) == 18 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-674180143);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (Q == eVar) {
                Q = t.N(new tb.f(m0Var, 3));
                rVar.k0(Q);
            }
            l3 l3Var = (l3) Q;
            rVar.s(false);
            rVar.b0(-674171330);
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q2 = rVar.Q();
            if (z10 || Q2 == eVar) {
                Q2 = new kd.f(l3Var, loadMore, null);
                rVar.k0(Q2);
            }
            rVar.s(false);
            t.e(l3Var, (Function2) Q2, rVar);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new x(m0Var, loadMore, i10, i14);
        }
    }

    public static final void s(o oVar, hb.u element, Function0 onClickCallbacks, t0.n nVar, int i10, int i11) {
        o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        o oVar3;
        boolean z10;
        boolean z11;
        List list;
        hb.m mVar;
        List list2;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(onClickCallbacks, "onClickCallbacks");
        r rVar = (r) nVar;
        rVar.c0(202331669);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(element)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onClickCallbacks)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            if (i16 != 0) {
                oVar3 = g1.l.f16404b;
            } else {
                oVar3 = oVar2;
            }
            rVar.b0(1512577274);
            int i17 = i12 & 112;
            if (i17 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (z10 || Q == eVar) {
                Q = element.f18230a;
                rVar.k0(Q);
            }
            hb.s sVar = (hb.s) Q;
            rVar.s(false);
            rVar.b0(1512579427);
            if (i17 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object Q2 = rVar.Q();
            if (z11 || Q2 == eVar) {
                hb.m mVar2 = sVar.f18229f.f18212c;
                Q2 = null;
                if (mVar2 != null) {
                    list = mVar2.f18204a;
                } else {
                    list = null;
                }
                if (list != null && !list.isEmpty() && (mVar = sVar.f18229f.f18212c) != null && (list2 = mVar.f18204a) != null) {
                    Q2 = (hb.k) vt.g0.u(list2);
                }
                rVar.k0(Q2);
            }
            rVar.s(false);
            pp.b.b(androidx.compose.foundation.a.k(androidx.compose.foundation.layout.d.e(oVar3, 1.0f), onClickCallbacks, 7), h0.h.b(R(11, rVar)), n1.t.f28173e, androidx.compose.foundation.a.a(androidx.compose.ui.graphics.a.d(4293189119L), R(1, rVar)), R(4, rVar), b1.d.c(327272120, new o0(4, sVar, onClickCallbacks, (hb.k) Q2), rVar), rVar, 1573248, 8);
            oVar2 = oVar3;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 10, oVar2, element, onClickCallbacks);
        }
    }

    public static final void t(Option option, ArenaSortOptions arenaSortOptions, Function1 function1, Function0 dismiss, t0.n nVar, int i10, int i11) {
        Function1 function12;
        Intrinsics.checkNotNullParameter(arenaSortOptions, "arenaSortOptions");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        r rVar = (r) nVar;
        rVar.c0(-1429345633);
        if ((i11 & 4) != 0) {
            function12 = wc.a.f38999a;
        } else {
            function12 = function1;
        }
        pp.b.b(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), h0.h.a(10, 10), 0L, null, s0.g.f34069a, b1.d.c(1755769218, new z((Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b), arenaSortOptions, option, dismiss, function12, 2), rVar), rVar, 1572870, 60);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.y((Object) option, (Object) arenaSortOptions, (ut.d) function12, dismiss, i10, i11, 7);
        }
    }

    public static final void u(Option option, Option option2, Function1 function1, Function0 dismiss, t0.n nVar, int i10, int i11) {
        Function1 function12;
        o2.v vVar;
        boolean z10;
        q1.b u10;
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        r rVar = (r) nVar;
        rVar.c0(-537539902);
        if ((i11 & 4) != 0) {
            function12 = wc.c.f39006a;
        } else {
            function12 = function1;
        }
        if (Intrinsics.a(option, option2)) {
            vVar = jh.c.f21375d;
        } else {
            vVar = jh.c.f21372a;
        }
        o2.v vVar2 = vVar;
        rVar.b0(-483455358);
        g1.l lVar = g1.l.f16404b;
        int i12 = 0;
        l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i13 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        boolean z11 = rVar.f35166a instanceof t0.f;
        if (z11) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t.v0(rVar, a10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t.v0(rVar, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar, i13, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            o k10 = androidx.compose.foundation.a.k(v.e.f(lVar, 8, rVar, lVar, 1.0f), new wc.d(function12, option, dismiss, i12), 7);
            rVar.b0(693286680);
            l1 a11 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar, 0);
            rVar.b0(-1323940314);
            int i14 = rVar.P;
            r1 o11 = rVar.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(k10);
            if (z11) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, a11, iVar);
                t.v0(rVar, o11, iVar2);
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                    nn.d.s(i14, rVar, i14, iVar3);
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                b9.b(option.getLabel(), androidx.compose.foundation.a.k(lVar, new wc.d(function12, option, dismiss, 1), 7), 0L, yk.j.e1(12), null, null, vVar2, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 3072, 0, 130996);
                if (1.0f > 0.0d) {
                    androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar);
                    if (Intrinsics.a(option, option2)) {
                        rVar.b0(1942730794);
                        u10 = w0.u(R.drawable.ic_radio_button_checked, rVar, 6);
                        z10 = false;
                    } else {
                        z10 = false;
                        rVar.b0(1942732825);
                        u10 = w0.u(R.drawable.ic_radio_button_unchecked_purple, rVar, 6);
                    }
                    rVar.s(z10);
                    boolean z12 = z10;
                    androidx.compose.foundation.a.c(u10, "Tick", null, null, null, s0.g.f34069a, null, rVar, 56, 124);
                    v.e.y(rVar, z12, true, z12, z12);
                    x1 t10 = da.e.t(rVar, z12, true, z12, z12);
                    if (t10 != null) {
                        t10.f35245d = new d0.y((Object) option, (Object) option2, (ut.d) function12, dismiss, i10, i11, 8);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void v(java.lang.String r21, boolean r22, boolean r23, kotlin.jvm.functions.Function1 r24, t0.n r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.j.v(java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void w(String postId, m0 m0Var, boolean z10, boolean z11, boolean z12, String stockEntryPrice, String stockTargetPrice, List stockGraphEntries, hb.c stockTradeProgress, zb.e eVar, o oVar, t0.n nVar, int i10, int i11, int i12) {
        zb.e eVar2;
        int i13;
        ?? r62;
        Intrinsics.checkNotNullParameter(postId, "postId");
        Intrinsics.checkNotNullParameter(stockEntryPrice, "stockEntryPrice");
        Intrinsics.checkNotNullParameter(stockTargetPrice, "stockTargetPrice");
        Intrinsics.checkNotNullParameter(stockGraphEntries, "stockGraphEntries");
        Intrinsics.checkNotNullParameter(stockTradeProgress, "stockTradeProgress");
        r rVar = (r) nVar;
        rVar.c0(920590925);
        if ((i12 & 512) != 0) {
            eVar2 = new zb.e(true, zb.c.f42247a, 15, 15, 22, 25, zb.d.f42250a);
            i13 = i10 & (-1879048193);
        } else {
            eVar2 = eVar;
            i13 = i10;
        }
        int i14 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        g1.l lVar = g1.l.f16404b;
        o oVar2 = i14 != 0 ? lVar : oVar;
        rVar.b0(1262663462);
        boolean z13 = (((i10 & 234881024) ^ 100663296) > 67108864 && rVar.h(stockTradeProgress)) || (i10 & 100663296) == 67108864;
        Object Q = rVar.Q();
        if (z13 || Q == t0.m.f35080a) {
            Q = Boolean.valueOf(stockTradeProgress.f18149d);
            rVar.k0(Q);
        }
        boolean booleanValue = ((Boolean) Q).booleanValue();
        rVar.s(false);
        int i15 = i11 & 14;
        rVar.b0(733328855);
        int i16 = i15 >> 3;
        v c10 = s.c(g1.a.f16379a, false, rVar, (i16 & 14) | (i16 & 112));
        rVar.b0(-1323940314);
        int i17 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(oVar2);
        int i18 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t.v0(rVar, c10, c2.k.f7749e);
            t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                nn.d.s(i17, rVar, i17, iVar);
            }
            nn.d.q((i18 >> 3) & 112, j10, new m2(rVar), rVar, 2058660585);
            rVar.b0(1085492485);
            if (eVar2.f42254a) {
                r62 = 0;
                k(z10, z12, stockGraphEntries, androidx.compose.foundation.layout.d.g(oVar2, R(52, rVar)), rVar, ((i13 >> 6) & 14) | 512 | ((i13 >> 9) & 112));
            } else {
                r62 = 0;
            }
            rVar.s(r62);
            float f10 = stockTradeProgress.f18147b / 100.0f;
            o oVar3 = oVar2;
            yk.j.n0(postId, m0Var, z10, z11, booleanValue, stockEntryPrice, stockTargetPrice, stockTradeProgress.f18146a / 100.0f, stockTradeProgress.f18148c / 100.0f, f10, androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, eVar2.f42255b == zb.c.f42247a ? jr.h.d(rVar, 1085525369, 52, rVar, r62) : jr.h.d(rVar, 1085525721, r62, rVar, r62), s0.g.f34069a, s0.g.f34069a, 13), R(68, rVar)), eVar2, b1.d.c(491509188, new x2(1, booleanValue), rVar), b1.d.c(-1975959069, new zb.i(eVar2, z11, booleanValue, z10, stockTradeProgress), rVar), b1.d.c(-148460030, new zb.j(eVar2, z11, booleanValue, stockTradeProgress), rVar), b1.d.c(1679039009, new zb.k(f10), rVar), rVar, (i13 & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i13) | (3670016 & i13), ((i13 >> 24) & 112) | 224640, 0);
            x1 t10 = da.e.t(rVar, r62, true, r62, r62);
            if (t10 != null) {
                t10.f35245d = new lb.c(postId, m0Var, z10, z11, z12, stockEntryPrice, stockTargetPrice, stockGraphEntries, stockTradeProgress, eVar2, oVar3, i10, i11, i12);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final void x(o oVar, boolean z10, CreateGroupUser followerDto, Function0 onDelete, t0.n nVar, int i10, int i11) {
        o oVar2;
        boolean z11;
        float f10;
        c2.i iVar;
        boolean z12;
        Intrinsics.checkNotNullParameter(followerDto, "followerDto");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        r rVar = (r) nVar;
        rVar.c0(-583825715);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if (z11) {
            f10 = 0;
        } else {
            f10 = 8;
        }
        float f11 = f10;
        rVar.b0(693286680);
        l1 a10 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar, 0);
        rVar.b0(-1323940314);
        int i13 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        boolean z13 = rVar.f35166a instanceof t0.f;
        if (z13) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar2 = c2.k.f7749e;
            t.v0(rVar, a10, iVar2);
            c2.i iVar3 = c2.k.f7748d;
            t.v0(rVar, o10, iVar3);
            c2.i iVar4 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar, i13, iVar4);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            float f12 = 2;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f12), rVar);
            o x10 = androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, f11, s0.g.f34069a, 11);
            g1.e eVar = g1.a.f16392n;
            rVar.b0(-483455358);
            l1 a11 = y.a(b0.n.f2937c, eVar, rVar, 48);
            rVar.b0(-1323940314);
            int i14 = rVar.P;
            r1 o11 = rVar.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(x10);
            if (z13) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, a11, iVar2);
                t.v0(rVar, o11, iVar3);
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                    iVar = iVar4;
                    nn.d.s(i14, rVar, i14, iVar);
                } else {
                    iVar = iVar4;
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                o m10 = androidx.compose.foundation.layout.d.m(oVar2, 50);
                rVar.b0(733328855);
                v c10 = s.c(g1.a.f16379a, false, rVar, 0);
                rVar.b0(-1323940314);
                int i15 = rVar.P;
                r1 o12 = rVar.o();
                b1.c j12 = androidx.compose.ui.layout.a.j(m10);
                if (z13) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, c10, iVar2);
                    t.v0(rVar, o12, iVar3);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                        nn.d.s(i15, rVar, i15, iVar);
                    }
                    nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
                    y8.h hVar = new y8.h((Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b));
                    hVar.f41338c = followerDto.getDisplayImage();
                    hVar.b();
                    q6.l.c(hVar.a(), "User photo", androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.layout.a.t(lVar, 4), 46), h0.h.f17801a), w0.u(R.drawable.ic_placeholder_user, rVar, 6), null, null, null, rVar, 4152, 0, 65520);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f12), rVar);
                    q1.b u10 = w0.u(R.drawable.ic_purple_cross, rVar, 6);
                    o a12 = bVar.a(lVar, g1.a.f16381c);
                    rVar.b0(-2125271929);
                    if ((((i10 & 7168) ^ 3072) > 2048 && rVar.h(onDelete)) || (i10 & 3072) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Object Q = rVar.Q();
                    if (z12 || Q == t0.m.f35080a) {
                        Q = v.e.n(onDelete, 3, rVar);
                    }
                    rVar.s(false);
                    androidx.compose.foundation.a.c(u10, "Cross to delete user", androidx.compose.foundation.a.k(a12, (Function0) Q, 7), null, null, s0.g.f34069a, null, rVar, 56, 120);
                    v.e.y(rVar, false, true, false, false);
                    b9.b(kj.f.h(followerDto.getDisplayName()), androidx.compose.foundation.layout.d.q(lVar, 56), w0.e(R.color.hintColorGrey, rVar), 0L, null, null, null, 0L, null, new u2.i(3), 0L, 2, false, 1, 0, null, null, rVar, 48, 3120, 120312);
                    v.e.y(rVar, false, true, false, false);
                    x1 t10 = da.e.t(rVar, false, true, false, false);
                    if (t10 != null) {
                        t10.f35245d = new b0.x(oVar2, z11, followerDto, onDelete, i10, i11, 5);
                        return;
                    }
                    return;
                }
                al.d.v0();
                throw null;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void y(java.lang.String r22, java.lang.String r23, kotlin.jvm.functions.Function2 r24, t0.n r25, int r26) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.j.y(java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, t0.n, int):void");
    }

    public static int z(int i10) {
        if (i10 < 3) {
            A(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public abstract boolean G(b2.c cVar);

    public abstract Object P(b2.i iVar);
}
