package com.google.android.gms.internal.icing;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import da.e;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import okhttp3.HttpUrl;
import s0.g;

/* loaded from: classes2.dex */
final class zzeg {
    public static String zza(zzee zzeeVar, String str) {
        StringBuilder r10 = e.r("# ", str);
        zzc(zzeeVar, r10, 0);
        return r10.toString();
    }

    public static final void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzfb.zza(zzcf.zzj((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzcf) {
            sb2.append(": \"");
            sb2.append(zzfb.zza((zzcf) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzda) {
            sb2.append(" {");
            zzc((zzda) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append(UrlTreeKt.componentParamSuffix);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i13 = i10 + 2;
            zzb(sb2, i13, "key", entry.getKey());
            zzb(sb2, i13, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append(UrlTreeKt.componentParamSuffix);
            return;
        }
        sb2.append(": ");
        sb2.append(obj.toString());
    }

    private static void zzc(zzee zzeeVar, StringBuilder sb2, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean equals;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzeeVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str9 = (String) it.next();
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i10, zzd(str8), zzda.zzs(method2, zzeeVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i10, zzd(str7), zzda.zzs(method3, zzeeVar, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (((Method) hashMap2.get(str2)) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf5.length() != 0) {
                        str6 = "get".concat(valueOf5);
                    } else {
                        str6 = new String("get");
                    }
                    if (!hashMap.containsKey(str6)) {
                    }
                }
                String valueOf6 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(str.substring(1));
                if (valueOf7.length() != 0) {
                    str3 = valueOf6.concat(valueOf7);
                } else {
                    str3 = new String(valueOf6);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object zzs = zzda.zzs(method4, zzeeVar, new Object[0]);
                    if (method5 == null) {
                        if (zzs instanceof Boolean) {
                            if (((Boolean) zzs).booleanValue()) {
                                zzb(sb2, i10, zzd(str3), zzs);
                            }
                        } else if (zzs instanceof Integer) {
                            if (((Integer) zzs).intValue() != 0) {
                                zzb(sb2, i10, zzd(str3), zzs);
                            }
                        } else if (zzs instanceof Float) {
                            if (((Float) zzs).floatValue() != g.f34069a) {
                                zzb(sb2, i10, zzd(str3), zzs);
                            }
                        } else if (zzs instanceof Double) {
                            if (((Double) zzs).doubleValue() != 0.0d) {
                                zzb(sb2, i10, zzd(str3), zzs);
                            }
                        } else {
                            if (zzs instanceof String) {
                                equals = zzs.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                            } else if (zzs instanceof zzcf) {
                                equals = zzs.equals(zzcf.zzb);
                            } else if (zzs instanceof zzee) {
                                if (zzs != ((zzee) zzs).zzm()) {
                                    zzb(sb2, i10, zzd(str3), zzs);
                                }
                            } else {
                                if ((zzs instanceof Enum) && ((Enum) zzs).ordinal() == 0) {
                                }
                                zzb(sb2, i10, zzd(str3), zzs);
                            }
                            if (!equals) {
                                zzb(sb2, i10, zzd(str3), zzs);
                            }
                        }
                    } else if (((Boolean) zzda.zzs(method5, zzeeVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, zzd(str3), zzs);
                    }
                }
            }
        }
        if (!(zzeeVar instanceof zzcy)) {
            zzfe zzfeVar = ((zzda) zzeeVar).zzc;
            if (zzfeVar != null) {
                zzfeVar.zze(sb2, i10);
                return;
            }
            return;
        }
        throw null;
    }

    private static final String zzd(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }
}
