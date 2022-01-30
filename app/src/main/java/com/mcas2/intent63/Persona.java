package com.mcas2.intent63;

import android.os.Parcel;
import android.os.Parcelable;

public class Persona implements Parcelable {
    protected Persona(Parcel in) {
        nombre = in.readString();
        apellido1 = in.readString();
        apellido2 = in.readString();
        domicilio = in.readString();
        nacionalidad = in.readString();
        if (in.readByte() == 0) {
            fechaNacimiento = null;
        } else {
            fechaNacimiento = in.readLong();
        }
        NIF = in.readString();
        tutor1 = in.readParcelable(Persona.class.getClassLoader());
        tutor2 = in.readParcelable(Persona.class.getClassLoader());
        centroProcedencia = in.readString();
        cursoProcedencia = in.readString();
        becado = in.readByte() != 0;
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
