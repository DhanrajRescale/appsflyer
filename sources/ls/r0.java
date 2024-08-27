package ls;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25296a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25297b;

    public /* synthetic */ r0(Object obj, int i10) {
        this.f25296a = i10;
        this.f25297b = obj;
    }

    public static boolean a(Object obj, Object obj2) {
        if (d(obj) == d(obj2)) {
            int e10 = w.k.e(d(obj));
            if (e10 != 0) {
                if (e10 != 1) {
                    if (e10 != 2) {
                        if (e10 == 3) {
                            return true;
                        }
                        if (e10 != 4) {
                            if (e10 != 6) {
                                return false;
                            }
                        } else {
                            return g(obj).equals(g(obj2));
                        }
                    }
                } else {
                    return f(obj).equals(f(obj2));
                }
            }
            return obj.equals(obj2);
        }
        return false;
    }

    public static Object b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.has("property")) {
            if (jSONObject.has("property") && jSONObject.has(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                String string = jSONObject.getString("property");
                string.getClass();
                if (!string.equals("event")) {
                    if (string.equals("literal")) {
                        if (d(jSONObject.get(AppMeasurementSdk.ConditionalUserProperty.VALUE)) == 7 && jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE).equalsIgnoreCase("now")) {
                            return new Date();
                        }
                        Object obj = jSONObject.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        if (w.k.e(d(obj)) == 5) {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            JSONObject optJSONObject = jSONObject3.optJSONObject("window");
                            if (optJSONObject != null && optJSONObject.has(AppMeasurementSdk.ConditionalUserProperty.VALUE) && optJSONObject.has("unit")) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTime(new Date());
                                char c10 = 65535;
                                Integer valueOf = Integer.valueOf(optJSONObject.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE) * (-1));
                                String string2 = optJSONObject.getString("unit");
                                string2.getClass();
                                switch (string2.hashCode()) {
                                    case 99228:
                                        if (string2.equals("day")) {
                                            c10 = 0;
                                            break;
                                        }
                                        break;
                                    case 3208676:
                                        if (string2.equals("hour")) {
                                            c10 = 1;
                                            break;
                                        }
                                        break;
                                    case 3645428:
                                        if (string2.equals("week")) {
                                            c10 = 2;
                                            break;
                                        }
                                        break;
                                    case 104080000:
                                        if (string2.equals("month")) {
                                            c10 = 3;
                                            break;
                                        }
                                        break;
                                }
                                if (c10 != 0) {
                                    if (c10 != 1) {
                                        if (c10 != 2) {
                                            if (c10 == 3) {
                                                calendar.add(6, valueOf.intValue() * 30);
                                            } else {
                                                throw new IllegalArgumentException("Invalid unit specification for window " + optJSONObject.getString("unit"));
                                            }
                                        } else {
                                            calendar.add(6, valueOf.intValue() * 7);
                                        }
                                    } else {
                                        calendar.add(10, valueOf.intValue());
                                    }
                                } else {
                                    calendar.add(6, valueOf.intValue());
                                }
                                return calendar.getTime();
                            }
                            throw new IllegalArgumentException("Invalid window specification for value key " + jSONObject3.toString());
                        }
                        return obj;
                    }
                    throw new IllegalArgumentException("Invalid operand: Invalid property type: " + jSONObject.getString("property"));
                }
                return jSONObject2.opt(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            }
            throw new IllegalArgumentException("Missing required keys: property/value");
        }
        return c(jSONObject, jSONObject2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x075b, code lost:
    
        if (r27.getString("operator").equals(r6) != false) goto L409;
     */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x080c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(org.json.JSONObject r27, org.json.JSONObject r28) {
        /*
            Method dump skipped, instructions count: 2656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.r0.c(org.json.JSONObject, org.json.JSONObject):java.lang.Object");
    }

    public static int d(Object obj) {
        if (obj != null && !obj.equals(JSONObject.NULL)) {
            if (obj instanceof String) {
                return 7;
            }
            if (obj instanceof JSONArray) {
                return 1;
            }
            if (obj instanceof JSONObject) {
                return 6;
            }
            if (!(obj instanceof Double) && !(obj instanceof Integer) && !(obj instanceof Number)) {
                if (obj instanceof Boolean) {
                    return 2;
                }
                if (obj instanceof Date) {
                    return 3;
                }
                return 8;
            }
            return 5;
        }
        return 4;
    }

    public static Boolean f(Object obj) {
        boolean z10 = false;
        switch (w.k.e(d(obj))) {
            case 0:
                if (((JSONArray) obj).length() > 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 1:
                return (Boolean) obj;
            case 2:
                if (((Date) obj).getTime() > 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 3:
                return Boolean.FALSE;
            case 4:
                if (g(obj).doubleValue() != 0.0d) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 5:
                if (((JSONObject) obj).length() > 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 6:
                if (((String) obj).length() > 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                return Boolean.FALSE;
        }
    }

    public static Double g(Object obj) {
        int e10 = w.k.e(d(obj));
        double d10 = 0.0d;
        if (e10 != 1) {
            if (e10 != 2) {
                if (e10 != 4) {
                    if (e10 != 6) {
                        return null;
                    }
                } else {
                    if (obj instanceof Double) {
                        return (Double) obj;
                    }
                    if (obj instanceof Integer) {
                        return Double.valueOf(((Integer) obj).doubleValue());
                    }
                    if (obj instanceof Number) {
                        return Double.valueOf(((Number) obj).doubleValue());
                    }
                }
                try {
                    return Double.valueOf(Double.parseDouble((String) obj));
                } catch (NumberFormatException unused) {
                    return Double.valueOf(0.0d);
                }
            }
            if (((Date) obj).getTime() <= 0) {
                return null;
            }
            return new Double(r5.getTime());
        }
        if (((Boolean) obj).booleanValue()) {
            d10 = 1.0d;
        }
        return Double.valueOf(d10);
    }

    public final FutureTask e(Context context, String str, l0 l0Var) {
        FutureTask futureTask = new FutureTask(new a1(context, str, l0Var));
        ((Executor) this.f25297b).execute(futureTask);
        return futureTask;
    }

    @Override // ls.i0
    public final void h(n0 n0Var) {
        switch (this.f25296a) {
            case 0:
                l0 l0Var = n0Var.f25263e;
                String str = (String) this.f25297b;
                synchronized (l0Var.f25236a.f25265g) {
                    el.l.F("MixpanelAPI.API", "Setting push token on people profile: " + str);
                    l0Var.f25236a.f25265g.o(str);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str);
                    n0 n0Var2 = l0Var.f25236a;
                    if (!n0Var2.i()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$android_devices", jSONArray);
                            n0.a(n0Var2, l0Var.h(jSONObject, "$union"));
                        } catch (JSONException unused) {
                            el.l.M("MixpanelAPI.API", "Exception unioning a property");
                        }
                    }
                }
                return;
            default:
                n0Var.f();
                return;
        }
    }

    public r0() {
        this.f25296a = 3;
        this.f25297b = Executors.newSingleThreadExecutor();
    }

    public r0(JSONObject jSONObject) {
        this.f25296a = 2;
        if (!jSONObject.has("operator") || !jSONObject.has("children")) {
            throw new IllegalArgumentException("Missing required keys: operator children");
        }
        this.f25297b = jSONObject;
    }
}
