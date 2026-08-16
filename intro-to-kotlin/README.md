# Introduction to Kotlin and Android Development

[Course](https://firtman.github.io/intro-kotlin/)

## 1. Introduction

Native Clients -> Official SDKs -> Android -> Kotlin -> JetPack Compose -> Material Design

## 2. Android Overview

- Android -> Operating System

Layers -> Most of the App

- AOSP -> Android Open Source Project
- GMS -> Google Mobile Services
- Vendor OEM Software

Layer -> Huawei, Amazon

- AOSP -> Android Open Source Project
- Vendor OEM Software

Device Fragmentation

APK -> Android Package -> Zip

Zip -> Compiled VM Code + Meta data + assets + Signature

Installation

- Android Play store (AAB - Android App Bundle) -> Build apk by Play Store
- Enterprise -> internal employee
- Local

## 3. Android Version

Version -> one major per year

Code name deprecated from 10

API (SDK version) -> essential -> integer

Minimum SDK Version -> Installability -> Crash score

Target SDK Version -> Behavior -> Test Env -> Future

Compile SDK Version -> compiler version -> the newer the better

minSdk <= targetSdk <= compileSdk

the less sdk version, the few APIs

Support Libraries -> Framework with Polyfill to support backward compatibility -> JetPack -> AndroidX packages

SDK -> JavaVM (Not JVM of Oracle) -> own engine (Dalvik ART)

Java or Kotlin -> Java Byte Code -> Dalvik Executable -> Java VM -> NO native code (ndk is execeptional)

Garbage collector

## 4. Kotlin Overview

By JetBrains -> Android Studio

Open Source, Statically typed, Type Inference, Multiple Platform Language

Interpreted Languages -> Source Code
Intermediate Languages -> Bytecode (Kotlin)
Complied Languages -> Machine Code (Kotlin)

Android -> Intermediate Languages -> Bytecode (Kotlin)

JVM 6, JVM 8, Android Java DEX, JavaScript, Native iOS, Android

Kotlin Multi platform Mobile (KMM) for library

## 5. Kotlin Fundamentals

.kt -> kotlin
.kts -> kotlin scratch

semicolon optional

variable -> var

print -> console buffer , println -> new line

android does not support print, use println

conditional are expressions (if (x < 2>)) -> in replacement of ternary

when for switch, no break, else for default

loop -> while, for in
