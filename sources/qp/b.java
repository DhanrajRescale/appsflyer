package qp;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzip;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import mq.c;
import okhttp3.HttpUrl;
import tp.d;
import tp.e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f32124a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32125b = "frc";

    /* renamed from: c, reason: collision with root package name */
    public Integer f32126c = null;

    public b(c cVar) {
        this.f32124a = cVar;
    }

    public static boolean a(ArrayList arrayList, a aVar) {
        String str = aVar.f32118a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.f32118a.equals(str) && aVar2.f32119b.equals(aVar.f32119b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [tp.c, java.lang.Object] */
    public final ArrayList b() {
        e eVar = (e) ((d) this.f32124a.get());
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : eVar.f36346a.getConditionalUserProperties(this.f32125b, HttpUrl.FRAGMENT_ENCODE_SET)) {
            zzjb zzjbVar = up.b.f37319a;
            Preconditions.checkNotNull(bundle);
            ?? obj = new Object();
            obj.f36330a = (String) Preconditions.checkNotNull((String) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null));
            obj.f36331b = (String) Preconditions.checkNotNull((String) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null));
            obj.f36332c = zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            obj.f36333d = (String) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            obj.f36334e = ((Long) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            obj.f36335f = (String) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            obj.f36336g = (Bundle) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            obj.f36337h = (String) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            obj.f36338i = (Bundle) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            obj.f36339j = ((Long) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            obj.f36340k = (String) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            obj.f36341l = (Bundle) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            obj.f36343n = ((Boolean) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            obj.f36342m = ((Long) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            obj.f36344o = ((Long) zzha.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) {
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        c cVar = this.f32124a;
        if (cVar.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (hasNext) {
                    Map map = (Map) it.next();
                    String[] strArr = a.f32116g;
                    ArrayList arrayList3 = new ArrayList();
                    String[] strArr2 = a.f32116g;
                    for (int i10 = 0; i10 < 5; i10++) {
                        String str7 = strArr2[i10];
                        if (!map.containsKey(str7)) {
                            arrayList3.add(str7);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        try {
                            Date parse = a.f32117h.parse((String) map.get("experimentStartTime"));
                            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                            String str8 = (String) map.get("experimentId");
                            String str9 = (String) map.get("variantId");
                            if (map.containsKey("triggerEvent")) {
                                str6 = (String) map.get("triggerEvent");
                            }
                            arrayList2.add(new a(str8, str9, str6, parse, parseLong, parseLong2));
                        } catch (NumberFormatException e10) {
                            throw new Exception("Could not process experiment: one of the durations could not be converted into a long.", e10);
                        } catch (ParseException e11) {
                            throw new Exception("Could not process experiment: parsing experiment start time failed.", e11);
                        }
                    } else {
                        throw new Exception(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
                    }
                } else {
                    if (arrayList2.isEmpty()) {
                        if (cVar.get() != null) {
                            Iterator it2 = b().iterator();
                            while (it2.hasNext()) {
                                ((e) ((d) cVar.get())).f36346a.clearConditionalUserProperty(((tp.c) it2.next()).f36331b, null, null);
                            }
                            return;
                        }
                        throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    if (cVar.get() != null) {
                        ArrayList b10 = b();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = b10.iterator();
                        while (it3.hasNext()) {
                            tp.c cVar2 = (tp.c) it3.next();
                            String[] strArr3 = a.f32116g;
                            String str10 = cVar2.f36333d;
                            if (str10 != null) {
                                str5 = str10;
                            } else {
                                str5 = str6;
                            }
                            arrayList4.add(new a(cVar2.f36331b, String.valueOf(cVar2.f36332c), str5, new Date(cVar2.f36342m), cVar2.f36334e, cVar2.f36339j));
                            str6 = str6;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = arrayList4.iterator();
                        while (true) {
                            boolean hasNext2 = it4.hasNext();
                            str = this.f32125b;
                            if (!hasNext2) {
                                break;
                            }
                            a aVar = (a) it4.next();
                            if (!a(arrayList2, aVar)) {
                                arrayList5.add(aVar.a(str));
                            }
                        }
                        Iterator it5 = arrayList5.iterator();
                        while (it5.hasNext()) {
                            ((e) ((d) cVar.get())).f36346a.clearConditionalUserProperty(((tp.c) it5.next()).f36331b, null, null);
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            a aVar2 = (a) it6.next();
                            if (!a(arrayList4, aVar2)) {
                                arrayList6.add(aVar2);
                            }
                        }
                        ArrayDeque arrayDeque = new ArrayDeque(b());
                        if (this.f32126c == null) {
                            this.f32126c = Integer.valueOf(((e) ((d) cVar.get())).f36346a.getMaxUserProperties(str));
                        }
                        int intValue = this.f32126c.intValue();
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            a aVar3 = (a) it7.next();
                            while (arrayDeque.size() >= intValue) {
                                ((e) ((d) cVar.get())).f36346a.clearConditionalUserProperty(((tp.c) arrayDeque.pollFirst()).f36331b, null, null);
                            }
                            tp.c a10 = aVar3.a(str);
                            e eVar = (e) ((d) cVar.get());
                            eVar.getClass();
                            zzjb zzjbVar = up.b.f37319a;
                            String str11 = a10.f36330a;
                            if (str11 != null && !str11.isEmpty() && (((obj = a10.f36332c) == null || zzip.zza(obj) != null) && up.b.c(str11) && up.b.d(str11, a10.f36331b) && (((str2 = a10.f36340k) == null || (up.b.b(a10.f36341l, str2) && up.b.a(str11, a10.f36340k, a10.f36341l))) && (((str3 = a10.f36337h) == null || (up.b.b(a10.f36338i, str3) && up.b.a(str11, a10.f36337h, a10.f36338i))) && ((str4 = a10.f36335f) == null || (up.b.b(a10.f36336g, str4) && up.b.a(str11, a10.f36335f, a10.f36336g))))))) {
                                Bundle bundle = new Bundle();
                                String str12 = a10.f36330a;
                                if (str12 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str12);
                                }
                                String str13 = a10.f36331b;
                                if (str13 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str13);
                                }
                                Object obj2 = a10.f36332c;
                                if (obj2 != null) {
                                    zzha.zzb(bundle, obj2);
                                }
                                String str14 = a10.f36333d;
                                if (str14 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str14);
                                }
                                bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, a10.f36334e);
                                String str15 = a10.f36335f;
                                if (str15 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str15);
                                }
                                Bundle bundle2 = a10.f36336g;
                                if (bundle2 != null) {
                                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                                }
                                String str16 = a10.f36337h;
                                if (str16 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str16);
                                }
                                Bundle bundle3 = a10.f36338i;
                                if (bundle3 != null) {
                                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                                }
                                bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, a10.f36339j);
                                String str17 = a10.f36340k;
                                if (str17 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str17);
                                }
                                Bundle bundle4 = a10.f36341l;
                                if (bundle4 != null) {
                                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                                }
                                bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, a10.f36342m);
                                bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, a10.f36343n);
                                bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, a10.f36344o);
                                eVar.f36346a.setConditionalUserProperty(bundle);
                            }
                            arrayDeque.offer(a10);
                        }
                        return;
                    }
                    throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
            }
        } else {
            throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
