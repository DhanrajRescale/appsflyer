package a5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import h.f;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import tr.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f173f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static b f174g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f175a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f176b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f177c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f178d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final f f179e;

    public b(Context context) {
        this.f175a = context;
        this.f179e = new f(this, context.getMainLooper(), 2);
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f173f) {
            try {
                if (f174g == null) {
                    f174g = new b(context.getApplicationContext());
                }
                bVar = f174g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f176b) {
            try {
                a aVar = new a(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f176b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f176b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(aVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) this.f177c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f177c.put(action, arrayList2);
                    }
                    arrayList2.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(Intent intent) {
        boolean z10;
        int i10;
        ArrayList arrayList;
        String str;
        boolean z11;
        String str2;
        synchronized (this.f176b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f175a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z12 = true;
                if ((intent.getFlags() & 8) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f177c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        a aVar = (a) arrayList2.get(i11);
                        if (z10) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + aVar.f169a);
                        }
                        if (aVar.f171c) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                            i10 = i11;
                            str = action;
                            z11 = z12;
                        } else {
                            String str3 = action;
                            i10 = i11;
                            arrayList = arrayList2;
                            str = action;
                            z11 = z12;
                            int match = aVar.f169a.match(str3, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z10) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(aVar);
                                aVar.f171c = z11;
                            } else if (z10) {
                                if (match != -4) {
                                    if (match != -3) {
                                        if (match != -2) {
                                            if (match != -1) {
                                                str2 = "unknown reason";
                                            } else {
                                                str2 = "type";
                                            }
                                        } else {
                                            str2 = "data";
                                        }
                                    } else {
                                        str2 = LogCategory.ACTION;
                                    }
                                } else {
                                    str2 = "category";
                                }
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                            }
                        }
                        i11 = i10 + 1;
                        z12 = z11;
                        arrayList2 = arrayList;
                        action = str;
                    }
                    boolean z13 = z12;
                    if (arrayList3 != null) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            ((a) arrayList3.get(i12)).f171c = false;
                        }
                        this.f178d.add(new e(8, intent, arrayList3));
                        if (!this.f179e.hasMessages(z13 ? 1 : 0)) {
                            this.f179e.sendEmptyMessage(z13 ? 1 : 0);
                        }
                        return z13;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f176b) {
            try {
                ArrayList arrayList = (ArrayList) this.f176b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a aVar = (a) arrayList.get(size);
                    aVar.f172d = true;
                    for (int i10 = 0; i10 < aVar.f169a.countActions(); i10++) {
                        String action = aVar.f169a.getAction(i10);
                        ArrayList arrayList2 = (ArrayList) this.f177c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                a aVar2 = (a) arrayList2.get(size2);
                                if (aVar2.f170b == broadcastReceiver) {
                                    aVar2.f172d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f177c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
