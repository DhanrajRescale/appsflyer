package com.webengage.sdk.android.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.WindowManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.webengage.sdk.android.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class WebEngageUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f12717a = Pattern.compile("[{}()\\[\\].+*?^$\\\\|]");

    public static double a(String str, String str2) {
        return Double.parseDouble(String.valueOf(Math.abs((str2 + str).hashCode()) % 100));
    }

    public static String b() {
        return new GregorianCalendar().getTimeZone().getID();
    }

    public static Bundle c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static DisplayMetrics d(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static PackageInfo e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String readEntireStream(InputStream inputStream) {
        return g.a(inputStream);
    }

    public static int a(float f10, Context context) {
        return (int) TypedValue.applyDimension(1, f10, d(context));
    }

    public static String b(Context context) {
        String uuid;
        String str = "987" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.USER.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10);
        try {
            uuid = a(context);
            if (uuid.isEmpty() || uuid.equalsIgnoreCase("00000000-0000-0000-0000-000000000000")) {
                uuid = UUID.randomUUID().toString();
                Log.d("WebEngage", "Generating UUID as advertisement is unavailable: " + uuid);
            }
        } catch (Exception unused) {
            uuid = UUID.randomUUID().toString();
        }
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET + str + uuid + HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str2.getBytes(), 0, str2.length());
            byte[] digest = messageDigest.digest();
            String str3 = new String();
            for (byte b10 : digest) {
                int i10 = b10 & 255;
                if (i10 <= 15) {
                    str3 = jr.h.r(str3, "0");
                }
                StringBuilder p10 = da.e.p(str3);
                p10.append(Integer.toHexString(i10));
                str3 = p10.toString();
            }
            return str3.toUpperCase();
        } catch (NoSuchAlgorithmException unused2) {
            return str2;
        }
    }

    public static Bundle c(Map<String, Object> map) {
        Bundle bundle;
        String str;
        String str2;
        Bundle bundle2 = null;
        if (map == null) {
            return null;
        }
        try {
            bundle = new Bundle();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    str = (String) value;
                } else if (value instanceof String[]) {
                    bundle.putStringArray(key, (String[]) value);
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof boolean[]) {
                    bundle.putBooleanArray(key, (boolean[]) value);
                } else if (value instanceof Integer) {
                    bundle.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof int[]) {
                    bundle.putIntArray(key, (int[]) value);
                } else if (value instanceof Long) {
                    bundle.putLong(key, ((Long) value).longValue());
                } else if (value instanceof long[]) {
                    bundle.putLongArray(key, (long[]) value);
                } else if (value instanceof Float) {
                    bundle.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof float[]) {
                    bundle.putFloatArray(key, (float[]) value);
                } else if (value instanceof Double) {
                    bundle.putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof double[]) {
                    bundle.putDoubleArray(key, (double[]) value);
                } else if (value instanceof Bundle) {
                    bundle.putBundle(key, (Bundle) value);
                } else if (value instanceof Character) {
                    bundle.putChar(key, ((Character) value).charValue());
                } else if (value instanceof char[]) {
                    bundle.putCharArray(key, (char[]) value);
                } else if (value instanceof CharSequence) {
                    bundle.putCharSequence(key, (CharSequence) value);
                } else if (value instanceof CharSequence[]) {
                    bundle.putCharSequenceArray(key, (CharSequence[]) value);
                } else if (value instanceof Byte) {
                    bundle.putByte(key, ((Byte) value).byteValue());
                } else if (value instanceof byte[]) {
                    bundle.putByteArray(key, (byte[]) value);
                } else if (value instanceof Short) {
                    bundle.putShort(key, ((Short) value).shortValue());
                } else if (value instanceof short[]) {
                    bundle.putShortArray(key, (short[]) value);
                } else if (value instanceof Parcelable) {
                    bundle.putParcelable(key, (Parcelable) value);
                } else if (value instanceof Serializable) {
                    bundle.putSerializable(key, (Serializable) value);
                } else if (value instanceof List) {
                    List list = (List) value;
                    if (list.size() > 0) {
                        Object obj = list.get(0);
                        try {
                            if (obj instanceof Integer) {
                                bundle.putIntegerArrayList(key, (ArrayList) list);
                            } else if (obj instanceof String) {
                                bundle.putStringArrayList(key, (ArrayList) list);
                            } else if (obj instanceof Parcelable) {
                                bundle.putParcelableArrayList(key, (ArrayList) list);
                            } else if (obj instanceof CharSequence) {
                                bundle.putCharSequenceArrayList(key, (ArrayList) list);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str2 = "Exception while casting list to bundle";
                            Logger.e("WebEngage", str2, e);
                        }
                    } else {
                        Logger.e("WebEngage", "ArrayList size is zero for " + key);
                    }
                } else if (value instanceof IBinder) {
                    bundle.putBinder(key, (IBinder) value);
                } else if (value instanceof SparseArray) {
                    try {
                        bundle.putSparseParcelableArray(key, (SparseArray) value);
                    } catch (Exception e12) {
                        e = e12;
                        str2 = "Exception while adding SparseArray to bundle";
                        Logger.e("WebEngage", str2, e);
                    }
                } else {
                    str = String.valueOf(value);
                }
                bundle.putString(key, str);
            }
            return bundle;
        } catch (Exception e13) {
            e = e13;
            bundle2 = bundle;
            Logger.e("WebEngage", "Exception while converting map to bundle", e);
            return bundle2;
        }
    }

    public static Bundle a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static boolean c(String str) {
        return str == null || str.isEmpty();
    }

    public static Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
                Object readObject = objectInputStream.readObject();
                objectInputStream.close();
                return readObject;
            } catch (Exception unused) {
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String a() {
        return new SimpleDateFormat("Z", Locale.US).format(Calendar.getInstance().getTime());
    }

    public static String a(Context context) {
        AdvertisingIdClient.Info info;
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (i.a() && isGooglePlayServicesAvailable == 0) {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(context);
            } catch (Exception e10) {
                Logger.d("WebEngage", "Exception while fetching advertising ID" + e10.toString());
                info = null;
            }
            if (info != null) {
                return info.getId();
            }
        } else {
            Logger.d("WebEngage", "com.google.android.gms.ads.identifier.AdvertisingIdClient or Google play-services is missing");
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return f12717a.matcher(str).replaceAll("\\\\$0");
    }

    public static String a(String str, int i10) {
        if (str != null) {
            return str.length() > i10 ? str.substring(0, i10) : str;
        }
        return null;
    }

    public static Map<String, Object> a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.get(str));
        }
        return hashMap;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof Map) && (obj2 instanceof Map)) {
            Map map = (Map) obj;
            Map map2 = (Map) obj2;
            if (map.size() != map2.size()) {
                return false;
            }
            for (Object obj3 : map.keySet()) {
                if (!map2.containsKey(obj3) || !a(map.get(obj3), map2.get(obj3))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof List) || !(obj2 instanceof List)) {
            return ((obj instanceof Number) && (obj2 instanceof Number)) ? Math.abs(((Number) obj).doubleValue() - ((Number) obj2).doubleValue()) < 1.0E-10d : ((obj instanceof CharSequence) && (obj2 instanceof CharSequence)) ? String.valueOf(obj).equals(String.valueOf(obj2)) : obj.equals(obj2);
        }
        List list = (List) obj;
        List list2 = (List) obj2;
        if (list.size() != list2.size()) {
            return false;
        }
        for (Object obj4 : list) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (a(obj4, it.next())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean a(HttpURLConnection httpURLConnection) {
        String contentEncoding = httpURLConnection.getContentEncoding();
        return contentEncoding != null && (contentEncoding.equals("gzip") || contentEncoding.equals("zip") || contentEncoding.equals("application/x-gzip-compressed"));
    }

    public static byte[] a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream2);
            objectOutputStream.writeObject(obj);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            objectOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }

    public static String b(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringBuffer.append(stringBuffer.length() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : "&");
            stringBuffer.append(entry.getKey());
            stringBuffer.append("=");
            stringBuffer.append(entry.getValue());
        }
        return stringBuffer.toString();
    }

    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
