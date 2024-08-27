package os;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mixpanel.android.util.ImageStore$CantGetImageException;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ls.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f30305e = new Class[0];

    /* renamed from: f, reason: collision with root package name */
    public static final List f30306f = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final Context f30307a;

    /* renamed from: b, reason: collision with root package name */
    public final l.d f30308b;

    /* renamed from: c, reason: collision with root package name */
    public final ns.c f30309c;

    /* renamed from: d, reason: collision with root package name */
    public final u f30310d;

    public e(Context context, z0 z0Var, ns.c cVar, u uVar) {
        this.f30307a = context;
        this.f30308b = z0Var;
        this.f30309c = cVar;
        this.f30310d = uVar;
    }

    public static List e(JSONArray jSONArray, l.d dVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            String N = yk.g.N("prefix", jSONObject);
            String N2 = yk.g.N("view_class", jSONObject);
            int optInt = jSONObject.optInt("index", -1);
            String N3 = yk.g.N("contentDescription", jSONObject);
            int optInt2 = jSONObject.optInt("id", -1);
            String N4 = yk.g.N("mp_id_name", jSONObject);
            String N5 = yk.g.N("tag", jSONObject);
            boolean equals = "shortest".equals(N);
            List list = f30306f;
            if (equals) {
                i10 = 1;
            } else if (N == null) {
                i10 = 0;
            } else {
                el.l.V0("MixpanelAPI.EProtocol", "Unrecognized prefix type \"" + N + "\". No views will be matched");
                return list;
            }
            Integer i12 = i(optInt2, N4, dVar);
            if (i12 == null) {
                return list;
            }
            arrayList.add(new l(i10, N2, optInt, N3, i12.intValue(), N5));
        }
        return arrayList;
    }

    public static m f(Class cls, JSONObject jSONObject) {
        q.h hVar;
        try {
            String string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str = null;
            if (jSONObject.has("get")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("get");
                hVar = new q.h(cls, jSONObject2.getString("selector"), f30305e, Class.forName(jSONObject2.getJSONObject("result").getString("type")));
            } else {
                hVar = null;
            }
            if (jSONObject.has("set")) {
                str = jSONObject.getJSONObject("set").getString("selector");
            }
            return new m(string, cls, hVar, str);
        } catch (ClassNotFoundException e10) {
            throw new Exception("Can't read property JSON, relevant arg/return class not found", e10);
        } catch (NoSuchMethodException e11) {
            throw new Exception("Can't create property reader", e11);
        } catch (JSONException e12) {
            throw new Exception("Can't read property JSON", e12);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.util.Pair, ns.d] */
    public static ns.d h(JSONObject jSONObject) {
        Object string;
        try {
            String string2 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String string3 = jSONObject.getString("type");
            if ("number".equals(string3)) {
                String string4 = jSONObject.getString("encoding");
                if ("d".equals(string4)) {
                    string = Double.valueOf(jSONObject.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                } else if ("l".equals(string4)) {
                    string = Long.valueOf(jSONObject.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                } else {
                    throw new Exception("number must have encoding of type \"l\" for long or \"d\" for double in: " + jSONObject);
                }
            } else if ("boolean".equals(string3)) {
                string = Boolean.valueOf(jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            } else if ("string".equals(string3)) {
                string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            } else {
                throw new Exception("Unrecognized tweak type " + string3 + " in: " + jSONObject);
            }
            return new Pair(string2, string);
        } catch (JSONException e10) {
            throw new Exception("Can't read tweak update", e10);
        }
    }

    public static Integer i(int i10, String str, l.d dVar) {
        int i11;
        if (str != null) {
            if (((Map) dVar.f23560b).containsKey(str)) {
                i11 = dVar.g(str);
            } else {
                el.l.V0("MixpanelAPI.EProtocol", "Path element contains an id name not known to the system. No views will be matched.\nMake sure that you're not stripping your packages R class out with proguard.\nid name was \"" + str + "\"");
                return null;
            }
        } else {
            i11 = -1;
        }
        if (-1 != i11 && -1 != i10 && i11 != i10) {
            el.l.M("MixpanelAPI.EProtocol", "Path contains both a named and an explicit id, and they don't match. No views will be matched.");
            return null;
        }
        if (-1 != i11) {
            return Integer.valueOf(i11);
        }
        return Integer.valueOf(i10);
    }

    public final Object a(Object obj, String str, ArrayList arrayList) {
        try {
            if ("java.lang.CharSequence".equals(str)) {
                return obj;
            }
            if (!"boolean".equals(str) && !"java.lang.Boolean".equals(str)) {
                if (!"int".equals(str) && !"java.lang.Integer".equals(str)) {
                    if (!"float".equals(str) && !"java.lang.Float".equals(str)) {
                        if ("android.graphics.drawable.Drawable".equals(str)) {
                            return b((JSONObject) obj, arrayList);
                        }
                        if ("android.graphics.drawable.BitmapDrawable".equals(str)) {
                            return b((JSONObject) obj, arrayList);
                        }
                        if ("android.graphics.drawable.ColorDrawable".equals(str)) {
                            return new ColorDrawable(((Number) obj).intValue());
                        }
                        throw new Exception("Don't know how to interpret type " + str + " (arg was " + obj + ")");
                    }
                    return Float.valueOf(((Number) obj).floatValue());
                }
                return Integer.valueOf(((Number) obj).intValue());
            }
            return obj;
        } catch (ClassCastException unused) {
            throw new Exception("Couldn't interpret <" + obj + "> as " + str);
        }
    }

    public final BitmapDrawable b(JSONObject jSONObject, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        try {
            if (!jSONObject.isNull("url")) {
                String string = jSONObject.getString("url");
                if (jSONObject.isNull("dimensions")) {
                    z10 = false;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("dimensions");
                    i10 = jSONObject2.getInt("left");
                    i11 = jSONObject2.getInt("right");
                    i12 = jSONObject2.getInt("top");
                    i13 = jSONObject2.getInt("bottom");
                    z10 = true;
                }
                try {
                    Bitmap a10 = this.f30309c.a(string);
                    arrayList.add(string);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), a10);
                    if (z10) {
                        bitmapDrawable.setBounds(i10, i12, i11, i13);
                    }
                    return bitmapDrawable;
                } catch (ImageStore$CantGetImageException e10) {
                    throw new Exception(e10.getMessage(), e10.getCause());
                }
            }
            throw new Exception("Can't construct a BitmapDrawable with a null url");
        } catch (JSONException e11) {
            throw new Exception("Couldn't read drawable description", e11);
        }
    }

    public final wn.e c(JSONObject jSONObject) {
        k0 g0Var;
        Integer i10;
        q.h hVar;
        l.d dVar = this.f30308b;
        ArrayList arrayList = new ArrayList();
        try {
            List e10 = e(jSONObject.getJSONArray("path"), dVar);
            if (e10.size() != 0) {
                if (jSONObject.getString("change_type").equals("property")) {
                    String string = jSONObject.getJSONObject("property").getString("classname");
                    if (string != null) {
                        try {
                            m f10 = f(Class.forName(string), jSONObject.getJSONObject("property"));
                            JSONArray jSONArray = jSONObject.getJSONArray("args");
                            Object[] objArr = new Object[jSONArray.length()];
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
                                objArr[i11] = a(jSONArray2.get(0), jSONArray2.getString(1), arrayList);
                            }
                            String str = f10.f30361d;
                            if (str == null) {
                                hVar = null;
                            } else {
                                hVar = new q.h(f10.f30359b, str, objArr, Void.TYPE);
                            }
                            if (hVar != null) {
                                g0Var = new i0(e10, hVar, f10.f30360c);
                            } else {
                                throw new Exception("Can't update a read-only property " + f10.f30358a + " (add a mutator to make this work)");
                            }
                        } catch (ClassNotFoundException e11) {
                            throw new Exception("Can't find class for visit path: ".concat(string), e11);
                        }
                    } else {
                        throw new Exception("Can't bind an edit property without a target class");
                    }
                } else if (jSONObject.getString("change_type").equals("layout")) {
                    JSONArray jSONArray3 = jSONObject.getJSONArray("args");
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray3.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        JSONObject optJSONObject = jSONArray3.optJSONObject(i12);
                        String string2 = optJSONObject.getString("view_id_name");
                        String string3 = optJSONObject.getString("anchor_id_name");
                        Integer i13 = i(-1, string2, dVar);
                        if (string3.equals("0")) {
                            i10 = 0;
                        } else if (string3.equals("-1")) {
                            i10 = -1;
                        } else {
                            i10 = i(-1, string3, dVar);
                        }
                        if (i13 != null && i10 != null) {
                            arrayList2.add(new e0(i13.intValue(), optJSONObject.getInt("verb"), i10.intValue()));
                        }
                        el.l.V0("MixpanelAPI.EProtocol", "View (" + string2 + ") or anchor (" + string3 + ") not found.");
                    }
                    g0Var = new g0(e10, arrayList2, jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), this.f30310d);
                } else {
                    throw new Exception("Can't figure out the edit type");
                }
                return new wn.e(g0Var, arrayList);
            }
            throw new Exception("Edit will not be bound to any element in the UI.");
        } catch (NoSuchMethodException e12) {
            throw new Exception("Can't create property mutator", e12);
        } catch (JSONException e13) {
            throw new Exception("Can't interpret instructions due to JSONException", e13);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [os.j0, os.c0] */
    public final c0 d(JSONObject jSONObject, d dVar) {
        try {
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("event_type");
            List e10 = e(jSONObject.getJSONArray("path"), this.f30308b);
            if (e10.size() != 0) {
                if ("click".equals(string2)) {
                    return new z(e10, 1, string, dVar);
                }
                if ("selected".equals(string2)) {
                    return new z(e10, 4, string, dVar);
                }
                if ("text_changed".equals(string2)) {
                    return new b0(e10, string, dVar);
                }
                if ("detected".equals(string2)) {
                    ?? c0Var = new c0(e10, string, dVar, false);
                    c0Var.f30343f = false;
                    return c0Var;
                }
                throw new Exception("Mixpanel can't track event type \"" + string2 + "\"");
            }
            throw new Exception("event '" + string + "' will not be bound to any element in the UI.");
        } catch (JSONException e11) {
            throw new Exception("Can't interpret instructions due to JSONException", e11);
        }
    }

    public final m.w g(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONObject(PaymentConstants.Category.CONFIG).getJSONArray("classes");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                Class<?> cls = Class.forName(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
                JSONArray jSONArray2 = jSONObject2.getJSONArray("properties");
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    arrayList.add(f(cls, jSONArray2.getJSONObject(i11)));
                }
            }
            return new m.w(this.f30307a, arrayList, this.f30308b);
        } catch (ClassNotFoundException e10) {
            throw new Exception("Can't resolve types for snapshot configuration", e10);
        } catch (JSONException e11) {
            throw new Exception("Can't read snapshot configuration", e11);
        }
    }
}
