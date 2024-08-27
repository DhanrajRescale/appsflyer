package com.google.android.recaptcha.internal;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import da.e;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import jr.h;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzia {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzhy zzhyVar, String str) {
        StringBuilder r10 = e.r("# ", str);
        zzd(zzhyVar, r10, 0);
        return r10.toString();
    }

    public static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
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
        zzc(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzja.zza(new zzew(((String) obj).getBytes(zzgw.zzb))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzez) {
            sb2.append(": \"");
            sb2.append(zzja.zza((zzez) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzgo) {
            sb2.append(" {");
            zzd((zzgo) obj, sb2, i10 + 2);
            sb2.append("\n");
            zzc(i10, sb2);
            sb2.append(UrlTreeKt.componentParamSuffix);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 2;
            zzb(sb2, i12, "key", entry.getKey());
            zzb(sb2, i12, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb2.append("\n");
            zzc(i10, sb2);
            sb2.append(UrlTreeKt.componentParamSuffix);
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzhy zzhyVar, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzhyVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 4), zzgo.zzy(method2, zzhyVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 3), zzgo.zzy(method, zzhyVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzy = zzgo.zzy(method4, zzhyVar, new Object[0]);
                    if (method5 == null) {
                        if (zzy instanceof Boolean) {
                            if (!((Boolean) zzy).booleanValue()) {
                            }
                            zzb(sb2, i10, substring, zzy);
                        } else if (zzy instanceof Integer) {
                            if (((Integer) zzy).intValue() == 0) {
                            }
                            zzb(sb2, i10, substring, zzy);
                        } else if (zzy instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzy).floatValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzy);
                        } else if (zzy instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzy).doubleValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzy);
                        } else {
                            if (zzy instanceof String) {
                                equals = zzy.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                            } else if (zzy instanceof zzez) {
                                equals = zzy.equals(zzez.zzb);
                            } else if (zzy instanceof zzhy) {
                                if (zzy == ((zzhy) zzy).zzX()) {
                                }
                                zzb(sb2, i10, substring, zzy);
                            } else {
                                if ((zzy instanceof Enum) && ((Enum) zzy).ordinal() == 0) {
                                }
                                zzb(sb2, i10, substring, zzy);
                            }
                            if (equals) {
                            }
                            zzb(sb2, i10, substring, zzy);
                        }
                    } else {
                        if (!((Boolean) zzgo.zzy(method5, zzhyVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i10, substring, zzy);
                    }
                }
            }
            i11 = 3;
        }
        if (zzhyVar instanceof zzgk) {
            Iterator zzf = ((zzgk) zzhyVar).zzb.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb2, i10, h.o("[", ((zzgl) entry2.getKey()).zza, "]"), entry2.getValue());
            }
        }
        zzjg zzjgVar = ((zzgo) zzhyVar).zzc;
        if (zzjgVar != null) {
            zzjgVar.zzi(sb2, i10);
        }
    }
}
