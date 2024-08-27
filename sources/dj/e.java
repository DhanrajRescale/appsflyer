package dj;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import aq.d0;
import b5.k0;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewV2ViewModel;
import com.assetgro.stockgro.ui.subscription.MySubscriptionFragment;
import com.assetgro.stockgro.ui.subscription.MySubscriptionViewModel;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansFragment;
import com.assetgro.stockgro.widget.ChatToolbar;
import com.facebook.FacebookException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.KickoffActivity;
import com.firebase.ui.auth.data.remote.GenericIdpAnonymousUpgradeLinkingHandler;
import com.firebase.ui.auth.viewmodel.email.EmailProviderResponseHandler;
import com.firebase.ui.auth.viewmodel.phone.PhoneProviderResponseHandler;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.encoders.EncodingException;
import d4.n1;
import d4.y0;
import e4.y;
import i5.w;
import ie.n;
import in.o;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import m.p2;
import nl.s;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;
import r7.j;
import t3.m;
import yo.k;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements j, k, p2, s, OnFailureListener, jm.b, Continuation, qn.a, pn.h, e4.d, mq.a, SuccessContinuation, EventListener.Factory, e5.j, y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14394b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f14393a = i10;
        this.f14394b = obj;
    }

    @Override // pn.h
    public Object apply(Object obj) {
        InputStream inputStream;
        int i10 = this.f14393a;
        Object obj2 = this.f14394b;
        switch (i10) {
            case 12:
                hn.d dVar = (hn.d) obj2;
                hn.b bVar = (hn.b) obj;
                dVar.getClass();
                URL url = bVar.f18625a;
                String q02 = al.d.q0("CctTransportBackend");
                if (Log.isLoggable(q02, 4)) {
                    Log.i(q02, String.format("Making request to: %s", url));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f18625a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(dVar.f18637g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = bVar.f18627c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            dVar.f18631a.f(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)), bVar.f18626b);
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer valueOf = Integer.valueOf(responseCode);
                            String q03 = al.d.q0("CctTransportBackend");
                            if (Log.isLoggable(q03, 4)) {
                                Log.i(q03, String.format("Status Code: %d", valueOf));
                            }
                            al.d.b0("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                            al.d.b0("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                            if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                                if (responseCode != 200) {
                                    return new hn.c(responseCode, null, 0L);
                                }
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                try {
                                    if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                        inputStream = new GZIPInputStream(inputStream2);
                                    } else {
                                        inputStream = inputStream2;
                                    }
                                    try {
                                        hn.c cVar = new hn.c(responseCode, null, o.a(new BufferedReader(new InputStreamReader(inputStream))).f20442a);
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        return cVar;
                                    } finally {
                                    }
                                } catch (Throwable th2) {
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                    }
                                    throw th2;
                                }
                            }
                            return new hn.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                        } finally {
                        }
                    } catch (Throwable th4) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (EncodingException e10) {
                    e = e10;
                    al.d.h0("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new hn.c(400, null, 0L);
                } catch (ConnectException e11) {
                    e = e11;
                    al.d.h0("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new hn.c(500, null, 0L);
                } catch (UnknownHostException e12) {
                    e = e12;
                    al.d.h0("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new hn.c(500, null, 0L);
                } catch (IOException e13) {
                    e = e13;
                    al.d.h0("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new hn.c(400, null, 0L);
                }
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                gn.b bVar2 = pn.j.f31244f;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j10));
                    if (set == null) {
                        set = new HashSet();
                        map.put(Long.valueOf(j10), set);
                    }
                    set.add(new pn.i(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.a((EventListener) this.f14394b, call);
    }

    @Override // e4.y
    public boolean d(View view) {
        String str;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f14394b;
        sideSheetBehavior.getClass();
        int i10 = this.f14393a;
        if (i10 != 1) {
            int i11 = 2;
            if (i10 != 2) {
                WeakReference weakReference = sideSheetBehavior.f11424o;
                if (weakReference != null && weakReference.get() != null) {
                    View view2 = (View) sideSheetBehavior.f11424o.get();
                    m mVar = new m(i10, i11, sideSheetBehavior);
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = n1.f13788a;
                        if (y0.b(view2)) {
                            view2.post(mVar);
                        }
                    }
                    mVar.run();
                } else {
                    sideSheetBehavior.s(i10);
                }
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i10 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(nn.d.o(sb2, str, " should not be set externally."));
    }

    @Override // mq.a
    public void e(mq.c cVar) {
        CrashlyticsNativeComponentDeferredProxy.a((CrashlyticsNativeComponentDeferredProxy) this.f14394b, cVar);
    }

    @Override // qn.a
    public Object execute() {
        int i10 = this.f14393a;
        int i11 = 0;
        Object obj = this.f14394b;
        switch (i10) {
            case 13:
                pn.j jVar = (pn.j) ((on.h) obj).f30146i;
                jVar.getClass();
                jVar.c(new pn.g(jVar, i11));
                return null;
            case 14:
                pn.j jVar2 = (pn.j) ((pn.c) obj);
                jVar2.getClass();
                int i12 = mn.a.f27832e;
                h8.h hVar = new h8.h(9);
                HashMap hashMap = new HashMap();
                SQLiteDatabase a10 = jVar2.a();
                a10.beginTransaction();
                try {
                    mn.a aVar = (mn.a) pn.j.l(a10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new n(6, jVar2, hashMap, hVar));
                    a10.setTransactionSuccessful();
                    return aVar;
                } finally {
                    a10.endTransaction();
                }
            case 15:
                pn.j jVar3 = (pn.j) ((pn.d) obj);
                return Integer.valueOf(((Integer) jVar3.c(new j5.j(jVar3, 2, ((rn.c) jVar3.f31246b).a() - jVar3.f31248d.f31229d))).intValue());
            default:
                on.i iVar = (on.i) obj;
                pn.j jVar4 = (pn.j) iVar.f30148b;
                jVar4.getClass();
                Iterator it = ((Iterable) jVar4.c(new w(12))).iterator();
                while (it.hasNext()) {
                    ((on.c) iVar.f30149c).a((jn.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // nl.s
    public void f(boolean z10) {
        String str = (String) this.f14394b;
        int i10 = FacebookException.f10879a;
        if (z10) {
            try {
                tl.a aVar = new tl.a(str);
                if (aVar.f36157b != null && aVar.f36158c != null) {
                    bl.j.Z(aVar.f36156a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // jm.b
    public void h() {
        gm.a aVar = (gm.a) this.f14394b;
        int i10 = gm.a.f17488m;
        aVar.p();
    }

    @Override // r7.j
    public void i() {
        String string;
        int i10 = this.f14393a;
        Object obj = this.f14394b;
        switch (i10) {
            case 0:
                g this$0 = (g) obj;
                int i11 = g.f14397h;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Bundle arguments = this$0.getArguments();
                if (arguments != null && (string = arguments.getString("STOCK_NAME")) != null) {
                    ((StockOverviewV2ViewModel) this$0.r()).h(string);
                    return;
                }
                return;
            default:
                MySubscriptionFragment this$02 = (MySubscriptionFragment) obj;
                int i12 = MySubscriptionFragment.f10503i;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((MySubscriptionViewModel) this$02.r()).j();
                return;
        }
    }

    @Override // e5.j
    public void invoke(Object obj) {
        ((b5.y0) obj).f((k0) this.f14394b, this.f14393a);
    }

    @Override // yo.k
    public void j(yo.g tab, int i10) {
        OtherSubscriptionPlansFragment this$0 = (OtherSubscriptionPlansFragment) this.f14394b;
        int i11 = OtherSubscriptionPlansFragment.f10518k;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.b(this$0.I().f15490a.getPackages().get(i10).getTitle());
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = this.f14393a;
        Object obj = this.f14394b;
        switch (i10) {
            case 6:
                KickoffActivity kickoffActivity = (KickoffActivity) obj;
                int i11 = KickoffActivity.f10897g;
                kickoffActivity.getClass();
                kickoffActivity.w(0, zl.d.d(new FirebaseUiException(2, exc)));
                return;
            case 7:
                ((GenericIdpAnonymousUpgradeLinkingHandler) obj).h(am.d.a(exc));
                return;
            case 8:
            case 9:
            default:
                PhoneProviderResponseHandler phoneProviderResponseHandler = (PhoneProviderResponseHandler) obj;
                phoneProviderResponseHandler.getClass();
                if (exc instanceof FirebaseAuthUserCollisionException) {
                    phoneProviderResponseHandler.i(((FirebaseAuthUserCollisionException) exc).f11652b);
                    return;
                } else {
                    phoneProviderResponseHandler.h(am.d.a(exc));
                    return;
                }
            case 10:
                ((EmailProviderResponseHandler) obj).h(am.d.a(exc));
                return;
        }
    }

    @Override // m.p2
    public boolean onMenuItemClick(MenuItem menuItem) {
        ChatToolbar this$0 = (ChatToolbar) this.f14394b;
        int i10 = ChatToolbar.F;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == this$0.f10593s) {
            qj.h hVar = this$0.onOptionSelected;
            if (hVar != null) {
                ((va.b) hVar).a(qj.i.f32006e);
            }
            this$0.o(false);
            return true;
        }
        if (itemId == this$0.f10594t) {
            qj.h hVar2 = this$0.onOptionSelected;
            if (hVar2 != null) {
                ((va.b) hVar2).a(qj.i.f32004c);
            }
            this$0.o(false);
            return true;
        }
        if (itemId == this$0.f10595u) {
            qj.h hVar3 = this$0.onOptionSelected;
            if (hVar3 != null) {
                ((va.b) hVar3).a(qj.i.f32007f);
            }
            this$0.o(false);
            return true;
        }
        if (itemId == this$0.f10596v) {
            qj.h hVar4 = this$0.onOptionSelected;
            if (hVar4 != null) {
                ((va.b) hVar4).a(qj.i.f32008g);
            }
            this$0.o(false);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = this.f14393a;
        Object obj2 = this.f14394b;
        switch (i10) {
            case 25:
                int[] iArr = jr.i.f21606k;
                return Tasks.forResult((jr.g) obj2);
            default:
                int[] iArr2 = jr.n.f21631p;
                ((HttpURLConnection) obj2).setRequestProperty("X-Goog-Firebase-Installations-Auth", ((nq.a) obj).f29073a);
                return Tasks.forResult(null);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10 = this.f14393a;
        Object obj = this.f14394b;
        switch (i10) {
            case 9:
                return task.isSuccessful() ? ((d0) ((zp.e) task.getResult())).f2698a.S((zp.d) obj) : task;
            case 22:
                return Boolean.valueOf(SessionReportingCoordinator.a((SessionReportingCoordinator) obj, task));
            case 23:
                return Utils.c((CountDownLatch) obj, task);
            default:
                ((m.w) obj).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if ("RST".equals(string2)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    }
                    if (string2 != null) {
                        throw new IOException(string2);
                    }
                    Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
